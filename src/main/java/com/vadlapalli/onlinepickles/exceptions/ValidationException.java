package com.vadlapalli.onlinepickles.exceptions;

public class ValidationException {
	private String detailMessage;

    public ValidationException(final String message) {
        super();
        this.detailMessage = message;
    }

    public ValidationException(final String message, final String detailMessage) {
        super();
        this.detailMessage = detailMessage;
    }

    public ValidationException(final String message, final Throwable cause) {
        super();
        this.detailMessage = message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }
}
