package com.example.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ResponseBody
	ExceptionResponse handleResponseNotFoundException(ResourceNotFoundException exception, HttpServletRequest request ) {
		ExceptionResponse exceptionResponse = new ExceptionResponse();
		exceptionResponse.setErrorMessage(exception.getMessage());
		exceptionResponse.setRequestURI(request.getRequestURI());
		return exceptionResponse;
		
	}

}
