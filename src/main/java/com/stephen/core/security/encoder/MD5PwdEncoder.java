package com.stephen.core.security.encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

import org.apache.commons.codec.binary.Hex;

public class MD5PwdEncoder implements PwdEncoder {

	public String encodePassword(String rawPass) {
		return encodePassword(rawPass, null);
	}

	public String encodePassword(String rawPass, String salt) {
		String password = mergePwdAndSalt(rawPass, salt, false);
		MessageDigest messageDigest = getMessageDigest();
		byte[] digest;
		try {
			digest = messageDigest.digest(password.getBytes("UTF-8"));
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("UTF-8 not supported!");
		}
		return new String(Hex.encodeHex(digest));
	}

	public boolean isPasswordValid(String encPass, String rawPass) {
		return isPasswordValid(encPass, rawPass, null);
	}

	public boolean isPasswordValid(String encPass, String rawPass, String salt) {
		if (encPass == null) {
			return false;
		}
		String pass2 = encodePassword(rawPass, salt);
		return encPass.equals(pass2);
	}

	protected MessageDigest getMessageDigest() {
		String algorithm = "MD5";
		try {
			return MessageDigest.getInstance(algorithm);
		} catch (Exception e) {
			throw new IllegalArgumentException("No such algorithm [" + algorithm + "]");
		}
	}

	protected String mergePwdAndSalt(String password, Object salt, boolean strict) {

		if (password == null) {
			password = "";
		}
		if (strict && (salt != null)) {
			if ((salt.toString().lastIndexOf("{") != -1) || (salt.toString().lastIndexOf("}") != -1)) {
				throw new IllegalArgumentException("Cannot use { or } in salt.toString()");
			}
		}
		if ((salt == null) || "".equals(salt)) {
			return password;
		} else {
			return password + "{" + salt.toString() + "}";
		}

	}

	private String defaultSalt;

	public String getDefaultSalt() {
		return defaultSalt;
	}

	public void setDefaultSalt(String defaultSalt) {
		this.defaultSalt = defaultSalt;
	}
}
