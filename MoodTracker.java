package com.mycompany;

// file: com/example/sleeptracker/MoodTracker.java
public class MoodTracker {

    private double moodRating; //mood rating 1-10 (10 being best)
    private String notes; //user entered notes on why they may feel that way

    public void setMood(double rating, String notes) {
        if (rating < 1 || rating > 10) {
            throw new IllegalArgumentException("Mood rating must be between 1 and 10");
        }
        this.moodRating = rating;
        this.notes = notes;
    }

    public double getMoodRating() {
        return this.moodRating;
    }

    public String getNotes() {
        return notes;
    }

    //method to compare sleep with mood
    public String moodSleepCorrelation(double avSleep, double moodRating) {
        System.out.println("--Mood/Sleep Correlation--");
        if (moodRating >= 0 && moodRating <= 4) {
            if (avSleep < 5) { //if less than 5 hours
                return "The lack of sleep may be heavily influencing your mood";
            } else if (avSleep >= 5 && avSleep <= 7) { //if more than 5 but less than or equal to 7 hours
                return "Mood is low, try get a few more hours sleep tonight and try improve sleep quality";
            } else {
                return "Youre sleeping well, so mood may be influenced by factors other than sleep";
            }
        } else if (moodRating > 4 && moodRating <= 7) {
            if (avSleep < 5) { //if less than 5 hours
                return "More sleep should improve your mood";
            } else if (avSleep >= 5 && avSleep <= 7) { //if more than 5 but less than or equal to 7 hours
                return "This is not a bad amount of sleep, but we recommend trying to get at least 8 hours";
            } else {
                return "Good amount of sleep. Do something you enjoy to try improve mood";
            }
        } else if (moodRating > 7 && moodRating <= 10) {
            if (avSleep < 5) { //if less than 5 hours
                return "It is great that your mood is good, but you need more sleep";
            } else if (avSleep >= 5 && avSleep <= 7) { //if more than 5 but less than or equal to 7 hours
                return "This is not a bad amount of sleep, but we recommend trying to get at least 8 hours";
            } else {
                return "Good sleep means good mood. Keep trying to improve sleep quality";
            }
        } else {
            return "Invalid mood rating";
        }
    }

    @Override
    public String toString() {
        return "Mood{rating=" + moodRating + ", notes='" + notes + "'}";
    }
}
