package com.bridgelabz.moodanalyser;

public class MoodAnalyserMain 
{

	public static void main(String[] args) throws MoodAnalyserException 
	{
		MoodAnalyser analyser = new MoodAnalyser();
		System.out.println(analyser.analyseMood("This is sad message"));
	}
}
