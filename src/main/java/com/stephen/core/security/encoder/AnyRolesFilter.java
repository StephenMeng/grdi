package com.stephen.core.security.encoder;

import java.util.Arrays;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

/**
 * Servlet Filter implementation class AnyRolesFilter
 */
public class AnyRolesFilter extends AuthorizationFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
			throws Exception {
		Subject subject = getSubject(request, response);
		String[] roles = (String[]) mappedValue;
		System.out.println(Arrays.toString(roles));
		if (roles == null || roles.length == 0) {
			return true;
		}
		for (String role : roles) {
			
			if (subject.hasRole(role)) {
				return true;
			}
		}
		return false;
	}
}
