package com.bridgelabz.moodanalyser;


public class MoodAnalyserException extends RuntimeException
{
	public enum ExceptionType
	{
		ENTERED_EMPTY,ENTERED_NULL;
	}
	public static ExceptionType type;
	public MoodAnalyserException(ExceptionType type, String message)
	{
		super(message);
		this.type = type;
	}
}
