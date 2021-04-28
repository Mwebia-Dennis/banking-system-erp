package com.penguins.bankingsystemerp.Exceptions;

public class AccountException extends Exception {

	/**
	 *
	 * @author dgitonga
	 */
	private static final long serialVersionUID = 1L;

	public AccountException(String error_msg) {
		super(error_msg);
	}
	
}
