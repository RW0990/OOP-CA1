import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        HydrationTracker hydrationTrack = new HydrationTracker();

        
        SimpleUser user1 = new SimpleUser("Alice", 28, 65.0);
        SleepInput sleepInput = new SleepInput();
        MoodTracker moodTracker = new MoodTracker();
        SleepAnalyzer sleepAnalyzer = new SleepAnalyzer();
        Dashboard dashboard = new Dashboard(user1, sleepAnalyzer, sleepInput,moodTracker, hydrationTrack);
        HydrationTracker hydrationTracker = new HydrationTracker();
        Forum forum = new Forum();



        //User sleep input
        sleepInput.setBedTime(22.5);
        sleepInput.setWakeUpTime(2.0); 

        
        //User mood input
        moodTracker.setMood(7.5, "Felt okay, a bit tired in the morning.");
        System.out.println(moodTracker.getMood());
        

        //User hydration input
        hydrationTracker.waterDrank(1500);

        //Add forum posts
        forum.addPost(moodTracker.getNotes());
        forum.addPost("I need to drink more water to stay hydrated.");
        forum.addPost("Trying to improve my sleep schedule!");

        //Display forum posts 
        forum.getPosts();

    
      

        dashboard.displayDashboard();

    }
}
