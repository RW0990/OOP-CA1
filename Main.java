package com.mycompany;
public class Main {
    public static void main(String[] args) {

        SimpleUser user1 = new SimpleUser("Alice", 28, 65.0);
        SleepInput sleepInput = new SleepInput();
        MoodTracker moodTracker = new MoodTracker();
        SleepAnalyzer sleepAnalyzer = new SleepAnalyzer();
        HydrationTracker hydrationTracker = new HydrationTracker();
        Forum forum = new Forum();
        FoodTracker foodTracker = new FoodTracker();
        Dashboard dashboard = new Dashboard(user1, sleepAnalyzer, sleepInput,moodTracker, hydrationTracker);


        //User sleep input
        sleepInput.setBedTime(23.5);
        sleepInput.setWakeUpTime(5.5); 

        
        //User mood input
        moodTracker.setMood(7.5, "Felt okay, a bit tired in the morning.");
        System.out.println(moodTracker.getMoodRating());
        

        //User hydration input
        hydrationTracker.waterDrank(1500);

        //Add forum posts
        forum.addPost(moodTracker.getNotes());
        forum.addPost("I need to drink more water to stay hydrated.");
        forum.addPost("Trying to improve my sleep schedule!");

        //Display forum posts 
        forum.getPosts();

        //TEST CALORIES

        foodTracker.setMeal("potato", 2500);
        foodTracker.setMeal("meat", 1222);

        System.out.println(foodTracker.calcTotalCalories() + " total calories");

        foodTracker.getMealsList();

        dashboard.displayDashboard();

    }
}
