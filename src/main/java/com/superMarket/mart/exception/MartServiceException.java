/**
 * 
 */
package com.superMarket.mart.exception;

/**
 * @author kiran
 *
 */
public class MartServiceException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String exceptionMessage;
	public MartServiceException() {
		
	}
	public MartServiceException(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * @param exceptionMessage the exceptionMessage to set
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	

}
