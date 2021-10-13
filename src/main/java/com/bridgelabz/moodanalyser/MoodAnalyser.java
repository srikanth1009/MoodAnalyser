package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    /*
     * Method for returning happy
     */
	public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
        
        return "Sad";
    } 
        else if (message.toLowerCase().contains("Any")) {
        }
        return "Happy";
	}
}

