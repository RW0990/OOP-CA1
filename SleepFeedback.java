package com.mycompany;

public class SleepFeedback extends SleepAnalyzer {

    private final String feedback;

    public SleepFeedback(SleepAnalyzer analyzer) {
        double avg = analyzer.getAverageSleep();

        if (avg > 7) {
            feedback = "Your average sleep duration is good";
        } else {
            feedback = "Your average sleep duration is poor, try going to bed at a reasonable time";
        }
    }

    public String getFeedback() {
        return feedback;
    }
}
