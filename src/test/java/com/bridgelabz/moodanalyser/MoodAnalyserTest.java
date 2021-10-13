package com.bridgelabz.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    // Test case to analyze sad mood of the user
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser=new MoodAnalyser();
        String actualResult=moodanalyser.analyseMood("User is Sad");
        Assert.assertEquals("Sad",actualResult);
    }
    // Test case to analyze happy mood of the user
    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
    	MoodAnalyser moodanalyser = new MoodAnalyser();
    	String actualResult = moodanalyser.analyseMood("I am in Any Mood");
    	Assert.assertEquals("Happy", actualResult);
    }
}

