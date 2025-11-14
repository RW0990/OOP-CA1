import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        HydrationTracker hydrationTrack = new HydrationTracker();

        
        SimpleUser user1 = new SimpleUser("Alice", 28, 65.0);
        SleepInput sleepInput = new SleepInput();

        sleepInput.setBedTime(22.5);
        sleepInput.setWakeUpTime(2.5); 

        SleepAnalyzer sleepAnalyzer = new SleepAnalyzer();

        sleepAnalyzer.calcAvSleep(sleepInput.getBedTime(), sleepInput.getWakeUpTime());
        double sleepHours = sleepAnalyzer.getAverageSleep();

        MoodTracker moodTracker = new MoodTracker();
        moodTracker.setMood(7.5, "Feeling good after a restful sleep.");    
        String sleep = moodTracker.moodSleepCorrelation(sleepHours);

        System.out.println(sleep);

    }
}
