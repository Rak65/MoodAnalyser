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
}