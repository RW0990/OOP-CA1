package OOP_CA1_main;

import java.util.ArrayList;
import java.util.List;

public class FoodTracker {
    private List<String> meal = new ArrayList<>();
    private double calories;
    
    
    public void setMeal(List<String> meal, double calories) {
        this.meal = meal;
        this.calories = calories;
    }
    
    public void calcCalories(double calories){
        if (calories > 0){
            calories+=calories;
            System.out.println("The total calories so far is: "+ calories);
        } else {
            System.out.println("Please enter amount of calories");
        }
    }
    
    public double getCalories(){
        return calories;
    }
    
    public List<String> getMeals(){
        return new ArrayList(meal);
    }
}
