package com.bridgelabz.moodanalyser;

public class MoodAnalyser 
{
	String message;
	
	public MoodAnalyser() 
	{
		super();
	}

	public MoodAnalyser(String message) 
	{
		super();
		this.message = message;
	}

	public String analyseMood(String message) throws MoodAnalyserException
	{
		this.message = message;
		return analyseMood();
	}
	public String analyseMood() throws MoodAnalyserException
    {
		try
		{
	        if(message.contains("sad"))
	        {
	            return "SAD";
	        }
	        else
	        {
	            return "HAPPY";
	        }
		}
		catch (NullPointerException e) 
		{
			throw new MoodAnalyserException("Please enter proper message");
		}
    }
}

