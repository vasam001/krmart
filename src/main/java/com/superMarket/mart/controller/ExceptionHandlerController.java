/**
 * 
 */
package com.superMarket.mart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.superMarket.mart.exception.MartExceptionResponse;
import com.superMarket.mart.exception.MartServiceException;

/**
 * @author kiran
 *
 */
@ControllerAdvice
public class ExceptionHandlerController {
	@ExceptionHandler(MartServiceException.class)
	public @ResponseBody MartExceptionResponse handleExceptionResponse(final MartServiceException exception,
			HttpServletRequest httpServletRequest) {
		System.out.println("Exception : " + exception.getExceptionMessage());
		MartExceptionResponse martExceptionResponse = new MartExceptionResponse();
		martExceptionResponse.setExeptionMessage(exception.getExceptionMessage());
		martExceptionResponse.setRequestedUri(httpServletRequest.getRequestURI());
		return martExceptionResponse;
	}

}
