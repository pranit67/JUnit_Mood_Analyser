package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_whenSad_shouldReturnSadMood() {
        MoodAnalyser obj = new MoodAnalyser("I am in Sad Mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenAny_shouldReturnHappyMood() {
        MoodAnalyser obj = new MoodAnalyser("I am in Any Mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_whenNull_shouldReturnHappyMood() {
        MoodAnalyser obj = new MoodAnalyser(null);
        String mood = obj.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}