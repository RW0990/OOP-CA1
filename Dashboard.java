package com.mycompany;

public class Dashboard {

    private double avgSleep;
    private double avgMood;
    private double avgWater;
    private SleepAnalyzer sleepAnalyzer;
    private SimpleUser user;
    private SleepInput sleepInput;
    private MoodTracker moodTracker;
    private HydrationTracker hydrationTracker;

    public Dashboard(SimpleUser user, SleepAnalyzer sleepAnalyzer, SleepInput sleepInput, MoodTracker moodTracker, HydrationTracker hydrationTracker) {
        this.moodTracker = moodTracker;
        this.user = user;
        this.sleepAnalyzer = sleepAnalyzer;
        this.sleepInput = sleepInput;
        this.hydrationTracker = hydrationTracker;

    }

    public void displayDashboard() {

        avgMood = moodTracker.getMoodRating();
        sleepAnalyzer.calcAvSleep(sleepInput.getBedTime(), sleepInput.getWakeUpTime());
        avgSleep = sleepAnalyzer.getAverageSleep();
        avgWater = hydrationTracker.getWater();

        System.out.println("----- User Dashboard -----");
        System.out.println("Name: " + user.getUserName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeightKg() + " kg");
        System.out.println("Average Sleep: " + avgSleep + " hours");
        System.out.println("Average Mood: " + avgMood + "/10");
        System.out.println("Average Water Intake: " + avgWater + " ml");
        System.out.println("--------------------------");

        System.out.println();
        System.out.println(moodTracker.moodSleepCorrelation(avgSleep, moodTracker.getMoodRating()));
        System.out.println("--------------------------");
        
        System.out.println();
        hydrationTracker.compareWater();
        System.out.println("--------------------------");

    }

}
