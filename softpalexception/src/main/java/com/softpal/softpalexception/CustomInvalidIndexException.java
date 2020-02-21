package com.softpal.softpalexception;


import java.io.IOException;

/**
 The type Custom invalid index exception.
 */
public class CustomInvalidIndexException extends IOException
{
	private static final String TAG = CustomInvalidIndexException.class.getSimpleName();
	
	@Override
	public String getMessage()
	{
		return "Please Sync the Data to proceed";
	}
}



