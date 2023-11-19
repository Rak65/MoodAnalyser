package com.moodanalyzer;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        this.message = "";
    }
    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Method to analyze the mood and return "HAPPY" or "SAD"
    public String analyseMood() {
        // Check the message contains the word "Sad"
        try {
            if (message.toLowerCase().contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
    }
}