/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;
import java.util.ArrayList;

/**
 *
 * @author ryanwhite
 */
public class SleepFeedback {

    private final String feedback;
    
    public SleepFeedback(SleepAnalyzer analyzer, SleepInput input){
        double avg = analyzer.getAverageSleep();
        
        //adding classes together in an arraylist for feedback
        ArrayList<SleepBuilder> sleepList = new ArrayList<>();
        sleepList.add(new SleepDuration());
        sleepList.add(new SleepReading());
        sleepList.add(new GetUp());
        
        StringBuilder sb = new StringBuilder();
        
        for(SleepBuilder sl : sleepList){
            sb.append(sl.buildFeedback(input, avg));
        }
        feedback = sb.toString();

    
}

    public String getFeedback() {
        return feedback;
    }
}
