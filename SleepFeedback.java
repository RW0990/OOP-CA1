public class SleepFeedback extends SleepAnalyzer {
    private String feedback;

    public SleepFeedback(){
        double avg=averageSleep();
    

    if(avg > 7){
        feedback="Your average sleep duration is good";
    }else{
        feedback="Your average sleep duration is poor, try going to bed at a reasonable time";
    }
    }
    public String getFeedback(){
        return feedback;
    }
}
