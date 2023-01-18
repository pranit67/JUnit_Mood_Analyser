package com.bridgelabz;

public class MoodAnalyser {
    //    public static void main(String[] args) {
//        System.out.println("Welcome to Mood Analyser Program.");
//}
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}
