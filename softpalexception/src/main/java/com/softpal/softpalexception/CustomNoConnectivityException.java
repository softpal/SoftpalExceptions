package com.softpal.softpalexception;


import java.io.IOException;

/**
 The type Custom no connectivity exception.
 */
public class CustomNoConnectivityException extends IOException

{
	
	@Override
	public String getMessage()
	{
		return "Your Network is unavailable. Check your data or wifi connection";
	}
	
}



