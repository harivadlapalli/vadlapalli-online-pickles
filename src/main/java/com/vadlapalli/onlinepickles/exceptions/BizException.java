package com.vadlapalli.onlinepickles.exceptions;

public class BizException {
	private String detailMessage;

	public BizException(final String message, final Throwable cause) {
		super();
	}

	public BizException(final String detailMessage) {
		super();
		this.detailMessage = detailMessage;
	}

	public BizException(final String message, final String detailMessage) {
		super();
		this.detailMessage = detailMessage;
	}

	public String getDetailMessage() {
		return detailMessage;
	}
}
