package com.stephen.core.security.realm;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.stephen.core.model.Permission;
import com.stephen.core.model.Role;
import com.stephen.core.model.User;
import com.stephen.core.security.encoder.MD5PwdEncoder;
import com.stephen.core.security.encoder.PwdEncoder;
import com.stephen.core.service.ShiroService;

public class UserRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		String userid = (String) getAvailablePrincipal(arg0);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		Set<String> s = new HashSet<String>();
		System.out.println("doGetAuthorizationInfo");
		Set<Role> roles = shiroService.getRoles(userid);
		Set<String> rolenames = new HashSet<>();
		for (Role role : roles) {
			for (Permission permission : shiroService.getPermissions(role.getRoleId())) {
				s.add(permission.getPermissionName());
			}
			rolenames.add(role.getRoleName());
		}
		info.setRoles(rolenames);
		info.setStringPermissions(s);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken arg0) throws AuthenticationException {
		String userid = (String) arg0.getPrincipal();
		System.out.println(userid);
		String password = new String((char[]) arg0.getCredentials());
		encoder = new MD5PwdEncoder();
		User user = shiroService.getUserByUserId(Integer.parseInt(userid));

		System.out.println(userid + "\t" + password);
		System.out.println("doGetAuthenticationInfo");
		System.out.println(user.getUserId() + "\t" + user.getPassword());
		if (userid.equals(user.getUserId() + "") && encoder.encodePassword(password).equals(user.getPassword())) {
			System.out.println("Authentication success!!");
			AuthenticationInfo aInfo = new SimpleAuthenticationInfo(userid, password, getName());
			return aInfo;
		}
		return null;
	}

	private PwdEncoder encoder;
	@Autowired
	private ShiroService shiroService;

	@Autowired
	public PwdEncoder getEncoder() {
		return encoder;
	}

	@Autowired
	public void setEncoder(PwdEncoder encoder) {
		this.encoder = encoder;
	}

}
