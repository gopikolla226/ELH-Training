package com.exception;

public class MyException extends Exception{
	private String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
	
	

}
