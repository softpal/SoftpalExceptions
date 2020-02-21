package com.softpal.softpalexception;


import java.io.IOException;

/**
 The type No connectivity exception.
 */
public class NoConnectivityException extends IOException
{
	
	@Override
	public String getMessage()
	{
		return "No network available, please check your WiFi or Data connection";
	}
	
}
