package com.mycompany.oopca1cp2upload;

import java.util.ArrayList;
import java.util.List;

public class FoodTracker {

    private ArrayList<Meals> mealList;
    private ArrayList<Double> caloriesList = new ArrayList<>();
    private double totalCal;

   
    public FoodTracker() {
        mealList = new ArrayList<>();
        totalCal = 0;
    }

    public void AddMeal(Meals newMeal) {
        mealList.add(newMeal);
        totalCal += newMeal.getMealCal();
    }

    //8888//
    public double getTotalCalories() {
        return totalCal;
    }

    // Get a list of all meals
    public void printMealList() {
        if (mealList.isEmpty()) {
            System.out.println("No meals recorded yet.");
        } else {
            for (Meals meal : mealList) {
                System.out.println(meal);
            }
        }
    }

    //88888//
    /*
    public void setMeal(String meals, double calories) {
        if(calories <=0){
            System.out.println("Please insert a valid amout ");
        }
        else {
            caloriesList.add(calories);
            mealList.add(meals);

        }

    }
    
    public double calcTotalCalories(){
       totalCal = 0;
       for( double cal:caloriesList){
        totalCal +=cal;
       }
       return totalCal;

    }
    
  
    
    public void  getMealsList(){
        for (String meal : mealList){
            System.out.println(meal);
        }
    }
    
     */
}
