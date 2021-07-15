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
			e.printStackTrace();
		}
	}
	
	@Test
	public void ifMessageIsNull_ShouldThroughCustomExceptionForNull()
	{
		
		MoodAnalyser analyser = new MoodAnalyser(null);
		String mood;
		try {
			ExpectedException exception = ExpectedException.none();
			exception.expect(MoodAnalyserException.class);
			mood = analyser.analyseMood();
			
		} catch (MoodAnalyserException e) 
		{
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void ifEmptyMessage_ShouldThroughCustomExceptionForEmpty()
	{
		MoodAnalyser analyser = new MoodAnalyser("");
		String mood;
		try 
		{
			ExpectedException exception = ExpectedException.none();
			exception.expect(MoodAnalyserException.class);
			mood=analyser.analyseMood();
		}
		catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}

