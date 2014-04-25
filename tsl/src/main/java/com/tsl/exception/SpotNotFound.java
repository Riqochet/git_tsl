package com.tsl.exception;

public class SpotNotFound extends Exception {

    /**
	 * generated in eclipse
	 */
	private static final long serialVersionUID = -6803848817601628850L;

	public SpotNotFound(String message) {
        super(message);
    }

    public SpotNotFound(String message, Throwable throwable) {
        super(message, throwable);
    }
}
