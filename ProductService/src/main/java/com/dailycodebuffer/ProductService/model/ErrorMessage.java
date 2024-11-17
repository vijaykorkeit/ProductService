package com.dailycodebuffer.ProductService.model;

public class ErrorMessage {

	private String errorMessage;
	private String errorCode;
	
	
	
	
	private ErrorMessage(Builder builder) {
		this.errorMessage=	builder.errorMessage;
		this.errorCode=builder.errorCode;
	}




	public String getErrorMessage() {
		return errorMessage;
	}




	public String getErrorCode() {
		return errorCode;
	}




	public static class Builder{
		

		private String errorMessage;
		private String errorCode;
		
		public Builder setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
			return this;
		}
		public Builder setErrorCode(String errorCode) {
			this.errorCode = errorCode;
			return this;
		}
		
public ErrorMessage build() {	
	return new ErrorMessage(this);
}
	}
	
}
