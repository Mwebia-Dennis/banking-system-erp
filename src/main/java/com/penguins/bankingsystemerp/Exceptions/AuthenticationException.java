package com.penguins.bankingsystemerp.Exceptions;

public class AuthenticationException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @author dgitonga
	 */

	public AuthenticationException(String error_msg) {
		super(error_msg);
		
	}
	
	
}
