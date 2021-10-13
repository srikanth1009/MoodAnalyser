package com.bridgelabz.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
	@Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage(null);
        try {
            String actualResult = moodanalyser.analyseMood();
            Assert.assertEquals("Entered Invalid Mood ", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}

