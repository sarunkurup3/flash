package com.exception;

public class AccountAleradyExits_Exception extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AccountAleradyExits_Exception(String e) {
		super(e);
		System.out.println("Account Already exists exception");
	}
	
}
