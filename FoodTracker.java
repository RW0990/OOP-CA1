package com.mycompany;



import java.util.ArrayList;
import java.util.List;

public class FoodTracker {
    private List<String> mealList = new ArrayList<>();
    private List <Double> caloriesList = new ArrayList<>();
    private double totalCal;
    
    
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
}
