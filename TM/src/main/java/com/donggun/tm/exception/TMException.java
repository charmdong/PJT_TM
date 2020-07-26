package com.donggun.tm.exception;

public class TMException extends RuntimeException {

	/**
	 * default serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public TMException() {
	}

	public TMException(String message) {
		super(message);
	}

}
