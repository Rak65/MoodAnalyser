package com.moodanalyzer;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    // Method to analyze the mood and return "HAPPY" or "SAD"
    public String analyseMood() {
        // Check the message contains the word "Sad"
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}