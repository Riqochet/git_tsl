package com.tsl.exception;

public class SurfboardNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1996846094861234096L;
	
    public SurfboardNotFound(String message) {
        super(message);
    }

    public SurfboardNotFound(String message, Throwable throwable) {
        super(message, throwable);
    }
}
