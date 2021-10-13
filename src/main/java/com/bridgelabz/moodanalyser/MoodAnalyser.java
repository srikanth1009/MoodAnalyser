package com.bridgelabz.moodanalyser;
/*
 * "I am in Happy Mood" message in Constructor Should Return Happy
 */
public class MoodAnalyser {
	public static String message;

	// Constructor
	public MoodAnalyser(String message) {
		this.message = message;
		analyseMood();
	}

	//Getter
	public String getMessage() {
		return message;
	}

	//Setter
	public void setMessage(String message) {
		this.message = message;
	}

	public String analyseMood() {
		try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}

