public class Dashboard {
    private double avgSleep;
    private double avgMood;
    private SleepAnalyzer sleepAnalyzer;
    private SimpleUser user;
    private double avgWater;
    private SleepInput sleepInput;
    private MoodTracker moodTracker;
    private HydrationTracker hydrationTracker;

    public Dashboard(SimpleUser user,SleepAnalyzer sleepAnalyzer, SleepInput sleepInput, MoodTracker moodTracker,HydrationTracker hydrationTracker) {
        this.moodTracker = moodTracker;
        this.user = user;
        this.sleepAnalyzer = sleepAnalyzer;
        this.sleepInput = sleepInput;
        this.hydrationTracker = hydrationTracker;
        
        
        
        
    }


    public void displayDashboard() {

        avgMood = moodTracker.getMood();
        sleepAnalyzer.calcAvSleep(sleepInput.getBedTime(), sleepInput.getWakeUpTime())  ;
        avgSleep = sleepAnalyzer.getAverageSleep();



        System.out.println("----- User Dashboard -----");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeight() + " kg");
        System.out.println("Average Sleep: " + avgSleep + " hours");
        System.out.println("Average Mood: " + avgMood + "/10");
        System.out.println("Average Water Intake: " + avgWater + " ml");
        System.out.println("--------------------------");


        System.out.println(moodTracker.moodSleepCorrelation(avgSleep));
        hydrationTracker.compareWater();

    }






    
}