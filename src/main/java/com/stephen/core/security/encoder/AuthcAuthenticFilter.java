package com.stephen.core.security.encoder;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class AuthcAuthenticFilter extends FormAuthenticationFilter {

	@Override
	protected boolean onLoginSuccess(AuthenticationToken token, Subject subject, ServletRequest request,
			ServletResponse response) throws Exception {
		String successUrl = this.getSuccessUrl();
		System.out.println("successUrl	" + successUrl);
		return super.onLoginSuccess(token, subject, request, response);
	}
}
