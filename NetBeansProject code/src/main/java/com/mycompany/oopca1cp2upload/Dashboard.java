/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author lapi
 */
public class Dashboard {

    private double avgSleep; //Take avgSleep from class SleepAnalyzer
    private double mood; //Take mood from class MoodTracker
    private int water; //Take water drank from class HydrationTracker
    private final SimpleUser user;
    private final SleepAnalyzer sleepAnalyzer;
    
    private final MoodTracker moodTracker;
    private final HydrationTracker hydrationTracker;

    public Dashboard(SimpleUser user, SleepAnalyzer sleepAnalyzer, MoodTracker moodTracker, HydrationTracker hydrationTracker) {
        this.user = user;
        this.sleepAnalyzer = sleepAnalyzer;
        this.hydrationTracker = hydrationTracker;
      
        this.moodTracker = moodTracker;

    }
    
    private void calculate(){
        this.mood = moodTracker.getMoodRating();
        this.avgSleep = sleepAnalyzer.getAverageSleep();
        this.water = hydrationTracker.getDailyWaterIntake();
    
    }

    public void displayDashboard() {
        calculate();
        
        
        System.out.println("----- User Dashboard -----");
        System.out.println("Name: " + user.getUserName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeightKg() + " kg");
        System.out.println("Average Sleep: " + avgSleep + " hours");
        System.out.println("Mood: " + mood + "/10");
        System.out.println("Water Intake: " + water + " ml");
        System.out.println("--------------------------");
    }
}
