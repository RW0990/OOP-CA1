// file: com/example/sleeptracker/MoodTracker.java
public class MoodTracker {

    private double moodRating; //mood rating 1-10 (10 being best)
    private String notes; //user entered notes on why they may feel that way

    public void setMood(double rating, String notes) {
        this.moodRating = rating;
        this.notes = notes;
    }

    public double getMood() {
        return moodRating;
    }
    
    //method to compare sleep with mood
    public String moodSleepCorrelation(double avSleep) {
        if (avSleep < 5) { //if less than 5 hours
            return "You need more sleep, this may effect your mood";
        } else if (avSleep >=5 && avSleep <=7) { //if more than 5 but less than or equal to 7 hours
            return "This is not a bad amount of sleep, but we recommend trying to get at least 8 hours";            
        } else {
            return "Good job, you reached the sleep goal!";
        }
    }

    @Override
    public String toString() {
        return "Mood{rating=" + moodRating + ", notes='" + notes + "'}";
    }
}