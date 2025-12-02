/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author taraj
 */
public class Meals {

    private String mealDesc;
    private double mealCal;

    public Meals(String mealDesc, double mealCal) {
        this.mealDesc = mealDesc;
        this.mealCal = mealCal;
    }

    public String getMealDesc() {
        return mealDesc;
    }

    public double getMealCal() {
        return mealCal;
    }

    @Override
    public String toString() {
        return mealDesc + " (" + mealCal + " calories)";
    }
}
