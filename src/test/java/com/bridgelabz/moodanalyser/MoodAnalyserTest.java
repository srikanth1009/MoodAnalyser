package com.bridgelabz.moodanalyser;
import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest
{
    // Test case to analyze sad mood of the user
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodanalyser=new MoodAnalyser("I am in Sad Mood");
        String actualResult=moodanalyser.analyseMood();
        Assert.assertEquals("Sad",actualResult);
    }
    // Test case to analyze happy mood of the user
    @Test
    public void givenMessage_ContainsAny_init_ShouldReturnHappy() {
    	MoodAnalyser moodanalyser = new MoodAnalyser("Iam in happy mood");
    	String actualResult = moodanalyser.analyseMood();
    	Assert.assertEquals("Happy", actualResult);
    }
    //Test case to Null Mood Should Return Happy
    @Test
    public void givenMessage_Null_ShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser(null);
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}

