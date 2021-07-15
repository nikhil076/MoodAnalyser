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
	        else if (message.isEmpty())
	        {
	            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Empty string passed");
	        }
	        return "HAPPY";
		}
		catch (NullPointerException e) 
		{
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter proper message");
		}
    }
}

