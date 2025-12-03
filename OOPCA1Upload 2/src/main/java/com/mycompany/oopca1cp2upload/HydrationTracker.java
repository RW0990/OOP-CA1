package com.mycompany.oopca1cp2upload;

import java.util.Scanner;
public class HydrationTracker {
    private int dailyWaterIntake; 
    private static final int recommendedAmount = 3000; /*3L recommended amount*/
    
    public HydrationTracker() {}

    public void setDailyWaterIntake(int dailyWaterIntake) {
        this.dailyWaterIntake = dailyWaterIntake;
    }

    public int getDailyWaterIntake() {
        return dailyWaterIntake;
    }

    /* user enters amount of water drank through out the day. amounts stack */
    public void waterDrank(int amount) {
        if (amount > 0) {
            dailyWaterIntake+= amount;
            System.out.println(amount + "ml added. Total water intake so far: " + dailyWaterIntake + "ml");
        } else {
            System.out.println("Please enter a valid amount");
        }
        
    }

    /* compare water intake to recommended amount and notify user if they reached goal or need to drink more */
    public int compareWater(){
        
        if (dailyWaterIntake>= recommendedAmount) {
            return 0;
        } else {
            int waterRemaining = recommendedAmount - dailyWaterIntake;
            return waterRemaining;
        }
    }
    
    public int getWater(){
        return dailyWaterIntake;
    }


}