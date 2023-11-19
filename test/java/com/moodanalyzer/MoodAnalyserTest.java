package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    @Test
    public void testAnalyseMoodSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        Assertions.assertEquals("SAD", moodAnalyser.analyseMood());
    }

    @Test
    public void testAnalyseMoodHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        Assertions.assertEquals("HAPPY", moodAnalyser.analyseMood());
    }
    @Test
    public void testAnalyseMoodDefaultConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(); // Default constructor with empty message
        Assertions.assertEquals("HAPPY", moodAnalyser.analyseMood());
    }

    @Test
    public void testAnalyseMoodEmptyMessageConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(""); // Constructor with empty message
        Assertions.assertEquals("HAPPY", moodAnalyser.analyseMood());
    }
    @Test
    public void testAnalyseMoodNull() {
        MoodAnalyser moodAnalyserNull = new MoodAnalyser(null);
        Assertions.assertEquals("HAPPY", moodAnalyserNull.analyseMood());
    }
}