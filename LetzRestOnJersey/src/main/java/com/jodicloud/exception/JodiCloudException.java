package com.jodicloud.exception;

public class JodiCloudException extends Exception {

	public JodiCloudException() {
	}

	public JodiCloudException(String message) {
		super(message);
	}

	public JodiCloudException(Throwable cause) {
		super(cause);
	}

	public JodiCloudException(String message, Throwable cause) {
		super(message, cause);
	}

	public JodiCloudException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
