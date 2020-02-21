package com.softpal.softpalexceptions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.softpal.softpalexception.CustomInvalidIndexException;

public class MainActivity extends AppCompatActivity
{
	private static final String TAG=MainActivity.class.getSimpleName();
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
}
