package com.softpal.softpalexception;

/**
 The type Custom db helper exception.
 */
public class CustomDBHelperException extends Exception
{
	/**
	 The Exception message.
	 */
	String exceptionMessage;
	
	/**
	 Instantiates a new Custom db helper exception.
	 */
	public CustomDBHelperException()
	{
		super("CustomDBHelperException has occurred");
	}
	
	/**
	 Instantiates a new Custom db helper exception.
	 
	 @param exceptionMessage the exception message
	 */
	public CustomDBHelperException(String exceptionMessage)
	{
		super(exceptionMessage);
		this.exceptionMessage = exceptionMessage;
	}
}
