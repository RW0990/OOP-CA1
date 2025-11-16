package com.mycompany;

// file: com/example/sleeptracker/SleepAnalyzer.java
public class SleepAnalyzer {

    private double averageSleep;

    public SleepAnalyzer() {

    }

    public void calcAvSleep(double bedTime, double wakeUpTime) {
        if (wakeUpTime < bedTime) { //if bed time is bigger than wake up time (before 12am)
            averageSleep = (24 - bedTime) + wakeUpTime;  //calculate hours before mignight slept then add wake time
        } else {
            averageSleep = wakeUpTime - bedTime; //if after 12am 
        }
    }

    public double getAverageSleep() {
        return averageSleep;
    }
}
