package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest 
{

	@Test
    public void testMoodAnalyser()throws Exception
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
	@Test
	public void ifMessageIsNotSad_shouldReturnHappy()
	{
		MoodAnalyser analyser = new MoodAnalyser();
		String mood;
		try {
			mood = analyser.analyseMood("This is any Messaage");
			Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifMessageIsNull_ShoulReturnHappy()
	{
		
		MoodAnalyser analyser = new MoodAnalyser();
		String mood;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(MoodAnalyserException.class);
			mood = analyser.analyseMood();
			
		} catch (MoodAnalyserException e) 
		{
			Assert.assertEquals("Please enter proper message", e.getMessage() );
		}
	}
}

