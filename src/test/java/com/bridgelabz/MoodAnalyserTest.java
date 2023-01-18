package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood() {
        MoodAnalyser obj = new MoodAnalyser();
        String mood = obj.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}