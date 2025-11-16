package com.mycompany;

// file: com/example/sleeptracker/SleepAnalyzer.java


public class SleepAnalyzer {
    private double averageSleep; 

    public SleepAnalyzer() {
       
    }


    public void calcAvSleep(double bedTime, double wakeUpTime) {
        averageSleep = (24 - bedTime) + wakeUpTime;
        
    }

    public double getAverageSleep() {
        return averageSleep;
    }
}  
