package com.bridgelabz.moodanalyser;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

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
		String mood = analyser.analyseMood("This is any Messaage");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	
	@Test
	public void ifMessageIsNull_ShoulReturnHappy()
	{
		MoodAnalyser analyser = new MoodAnalyser();
		String mood = analyser.analyseMood();
		Assert.assertEquals("HAPPY", mood );
	}
}

