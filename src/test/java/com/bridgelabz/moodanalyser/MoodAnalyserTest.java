package com.bridgelabz.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnSad() {
	        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
	        String actualResult = moodanalyser.analyseMood();
	        Assert.assertEquals("Sad", actualResult);
	    }
	 @Test
	    public void givenMessage_WhenProper_ShouldReturnHappy() {
	        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
	        String actualResult = moodanalyser.analyseMood();
	        Assert.assertEquals("Happy", actualResult);
	    }
}

