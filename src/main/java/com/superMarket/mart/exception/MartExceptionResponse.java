/**
 * 
 */
package com.superMarket.mart.exception;

/**
 * @author kiran
 *
 */
public class MartExceptionResponse {
	String exeptionMessage;
	String requestedUri;
	/**
	 * @return the exeptionMessage
	 */
	public String getExeptionMessage() {
		return exeptionMessage;
	}
	/**
	 * @param exeptionMessage the exeptionMessage to set
	 */
	public void setExeptionMessage(String exeptionMessage) {
		this.exeptionMessage = exeptionMessage;
	}
	/**
	 * @return the requestedUri
	 */
	public String getRequestedUri() {
		return requestedUri;
	}
	/**
	 * @param requestedUri the requestedUri to set
	 */
	public void setRequestedUri(String requestedUri) {
		this.requestedUri = requestedUri;
	}

}
