public class Dashboard {
    private double avgSleep;
    private double avgMood;
    private int avgWater;
    private SimpleUser user;

    public Dashboard(SimpleUser user) {
        this.user = user;
    }

    public void displayDashboard() {
        System.out.println("----- User Dashboard -----");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Weight: " + user.getWeight() + " kg");
        System.out.println("Average Sleep: " + avgSleep + " hours");
        System.out.println("Average Mood: " + avgMood + "/10");
        System.out.println("Average Water Intake: " + avgWater + " ml");
        System.out.println("--------------------------");
    }

    


    
}