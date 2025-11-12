// file: com/example/sleeptracker/MoodTracker.java


public class MoodTracker {
    private double moodRating; 
    private String notes;

    public void setMood(double rating, String notes) {
        this.moodRating = rating;
        this.notes = notes; 
    }

    public double getMood() { return moodRating; }

    public String moodSleepCorrelation(double avSleep) {
        return " ";
    }

    @Override
    public String toString() {
        return "Mood{rating=" + moodRating + ", notes='" + notes + "'}";
    }
}
