package com.mycompany.oopca1cp2upload;

import com.mycompany.oopca1cp2upload.FoodTracker;
import com.mycompany.oopca1cp2upload.MoodTracker;
import com.mycompany.oopca1cp2upload.HydrationTracker;
import com.mycompany.oopca1cp2upload.SimpleUser;
import com.mycompany.oopca1cp2upload.Forum;
import com.mycompany.oopca1cp2upload.Dashboard;
import com.mycompany.oopca1cp2upload.SleepInput;
import com.mycompany.oopca1cp2upload.SleepAnalyzer;
import com.mycompany.oopca1cp2uploadNEW.UserGui;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {

                new UserGui().setVisible(true);

            }

        });

        Scanner input = new Scanner(System.in);
        //SimpleUser user1 = new SimpleUser("Alice", 28, 65.0);

        //Francesco
        System.out.println("Good day! Please insert your name:");
        String userName = input.nextLine();

        System.out.println("Please insert your age:");
        int userAge = input.nextInt();

        System.out.println("insert your weight in Kg:");
        double userWeight = input.nextDouble();

        SimpleUser user = new SimpleUser(userName, userAge, userWeight);
        Forum forum = new Forum();
        char userChoice;
        
        //Ryan
        //FileClass fileClass = new FileClass("CA1/textfile.txt");
        ArrayList<SleepInput> weeklySleep = new ArrayList<>();

        
        //Creating an Arraylist od the days of the week 
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("\nWelcome to your average sleep calculator ");
        for (String day : days) {
            int hours;
            while (true) {
                System.out.println("Please enter the amount of hours you slept on " + day + ":");
                if (input.hasNextInt()) {
                    hours = input.nextInt();
                    break;
                } else {
                    System.out.println("Please enter a valid number eg.1,2,3,...");
                    input.next();
                }
            }

            SleepInput sleep = new SleepInput(hours);
            weeklySleep.add(sleep);

        }

        for (int i = 0; i < weeklySleep.size(); i++) {
            System.out.println(days[i] + ": " + weeklySleep.get(i).getHours() + " hours");
        }

        //analyzer to calculate average sleep
        SleepAnalyzer analyzer = new SleepAnalyzer();
        analyzer.calcAvSleep(weeklySleep);

        //get feedback for user on sleep duration
        SleepFeedback feedback = new SleepFeedback(analyzer, weeklySleep.get(0));

        System.out.println("\nYour total average sleep for this week is " + analyzer.getAverageSleep() + " hours");
        System.out.println(feedback.getFeedback());
        input.nextLine();

        //TARA
        boolean notesAdded = false;
        boolean validMood = false;
        boolean addingMeals = true;
        boolean validCals = false;
        boolean validWater = false;
        StringBuffer allNotes = new StringBuffer();
        String moodRatingString = "";
        int moodRating = 0;
        int mealCal = 0;
        int dailyWaterIntake = 0;

        //instances of other classes
        FoodTracker foodTracker = new FoodTracker();
        MoodTracker moodTracker = new MoodTracker();
        HydrationTracker hydrationTracker = new HydrationTracker();

        //water input
        System.out.println("\nPlease enter the amount of water you have drank today in millilitres");
        validWater = false;
        while (!validWater) {
            String waterInput = input.nextLine();
            try {
                dailyWaterIntake = Integer.parseInt(waterInput);
                if (dailyWaterIntake > 0) {
                    validWater = true;
                    hydrationTracker.setDailyWaterIntake(dailyWaterIntake);
                } else {
                    System.out.println("Please enter an integer greater than 1");
                }
                //catch when int conversion doesnt work
            } catch (NumberFormatException waterException) {
                System.out.println("Please enter a valid number");
            }
        }

        //mood input
        while (!validMood) { //while no mood entered
            //ask user for mood
            System.out.println("Please enter your mood on a scale of 1-10 with 10 being the best");
            moodRatingString = input.nextLine();

            try {
                moodRating = Integer.parseInt(moodRatingString);
                //check mood is a rating of 1-10
                if (moodRating >= 1 && moodRating <= 10) {
                    validMood = true; //end while  loop
                } else {
                    System.out.println("Please only enter a number between 1 and 10 inclusive.");
                }

            } catch (NumberFormatException moodException) {
                System.out.println("Please enter a valid number");
            }
        }

        //ask user if they want to add notes to mood
        System.out.println("Would you like to add any notes to your mood rating? (Y/N)");
        char notesChoice;
        //accept answer from user, convert to uppercase
        notesChoice = Character.toUpperCase(input.next().charAt(0));
        //clear scanner
        input.nextLine();

        //while user wants to add notes
        while (notesChoice == 'Y') {
            //let user enter notes
            System.out.println("Please enter your notes");
            String notes = input.nextLine();
            //add note to all notes and make a new line
            allNotes.append(notes).append("\n");
            notesAdded = true;
            notesChoice = 'N'; //end while loop
        }
        //send to mood tracker
        moodTracker.setMood(moodRating, allNotes.toString());
        moodTracker.toString();

        //meal inputs
        System.out.println("Please enter your meals for your own records");
        addingMeals = true;
        //while addingMeals is true, which is default

        while (addingMeals) {
            //ask user for meal
            System.out.println("Please enter a description of your meal:");
            String mealDesc = input.nextLine();

            //if user did not enter meal
            if (mealDesc.isEmpty()) {
                System.out.println("Please enter your meal, meal cannot be empty.");
                continue; //continue to ask user for meal
            }
            validCals = false;
            while (!validCals) {
                System.out.println("Please enter an estimated amount of calories:");
                String calInput = input.nextLine();
                //try converting string to int and validate
                try {
                    mealCal = Integer.parseInt(calInput);
                    if (mealCal > 0) {
                        validCals = true;
                    } else {
                        System.out.println("Please enter an integer greater than 1");
                    }
                    //catch when int conversion doesnt work
                } catch (NumberFormatException calException) {
                    System.out.println("Please enter a valid number");
                }
            }

            Meals newMeal = new Meals(mealDesc, mealCal);
            foodTracker.AddMeal(newMeal); //send meal to food tracker

            System.out.println("Meal: " + newMeal.toString()); //print meal and cals

            //ask user if they want to add more meals
            System.out.println("Would you like to add another meal? (Y/N)");
            char mealChoice = Character.toUpperCase(input.next().charAt(0));
            input.nextLine(); //clear scanner to prevent weird loop
            //if no, end loop
            if (mealChoice == 'N') {
                addingMeals = false;
            }
        }

        //output !! 
        //DASHBOARD
        Dashboard dashboard = new Dashboard(user, analyzer, moodTracker, hydrationTracker);
        dashboard.displayDashboard();

        System.out.println("-------- Summary ---------");
        //if notes have been added
        if (notesAdded) {
            //print mood rating and notes
            System.out.println("Your mood rating is: " + moodTracker.getMoodRating());
            System.out.println("You added this note: " + moodTracker.getNotes());
        } else {
            //if no notes added, only print mood
            System.out.println("Your mood rating is: " + moodTracker.getMoodRating() + " and you did not add any notes");
        }
        System.out.println("\n-----Hydration Status-----");
        System.out.println("Your water intake is: " + dailyWaterIntake + "ml");
        hydrationTracker.compareWater();
        System.out.println("\n---------- Meals ----------");
        // Print all meals and total calories
        System.out.println("Your meal list:");
        foodTracker.printMealList();

        System.out.println("\nTotal calories consumed: " + foodTracker.getTotalCalories());
        System.out.println("---------------------------");

        //User Forum, they can add comment and post to the website 
        while (true) {

            System.out.println("Do you want to add a new post?(Y/N)");
            userChoice = input.next().charAt(0);
            userChoice = Character.toUpperCase(userChoice);
            if (userChoice == 'Y') {
                input.nextLine();
                String post;
                System.out.println("Please insert new post");
                post = input.nextLine();
                forum.addPost(post);
            } else if (userChoice == 'N') {
                break;
            } else {
                System.out.println("Invalid Choice, please select Y or N");
            }
        }
        forum.getPosts();
        forum.toString();
        
        //Ryan File class
        /*
        fileClass.addFeedback("Name:"+userName);
        fileClass.addFeedback("Age" +userAge);
        fileClass.addFeedback("Weight" +userWeight);
        fileClass.addFeedback("Average sleep" +analyzer.getAverageSleep()+ " hours");
        fileClass.addFeedback("Sleep feedback " +feedback);
        fileClass.addFeedback("Mood notes: " +allNotes.toString().trim());
        fileClass.addFeedback("Daily water intake (L): " +dailyWaterIntake);
        //need summary for meals
        fileClass.addFeedback("Forum posts:" +forum);
*/

    }
}
