package com.bridgelabz;

public class MoodAnalyser {
    //    public static void main(String[] args) {
//        System.out.println("Welcome to Mood Analyser Program.");
//}
    public String analyseMood(String message) {
        if (message.contains("Sad")) {

            return "SAD";
        } else {
            return "HAPPY";
        }

    }
}
