package com.example.exception;

public class ExceptionResponse {
	private String errorMessage;
	private String requestURI;
	public ExceptionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionResponse(String errorMessage, String requestURI) {
		super();
		this.errorMessage = errorMessage;
		this.requestURI = requestURI;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getRequestURI() {
		return requestURI;
	}
	public void setRequestURI(String requestURI) {
		this.requestURI = requestURI;
	}
	

}
