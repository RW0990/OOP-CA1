/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author ryanwhite
 */
public class SleepDuration extends SleepBuilder {

    @Override
    public String buildFeedback(SleepInput input, double avgSleep) {
        //creating feedback for the user based on hours of sleep
        if (avgSleep > 9) {
            return  "Your average sleep is unhealthy sleeping over 9 hours a night can lead to health problems";
        } else if (avgSleep > 7) {
            return  "Your average sleep duration is good";
        } else {
            return "Your average sleep is poor, try going to bed at a reasonable time";
        }
    }
}
    
    

