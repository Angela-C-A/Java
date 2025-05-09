import java.time.LocalDate;

public class FitnessTracker {
    private String activity;
    private int minutes;
    private LocalDate date;

    public FitnessTracker() {
        this.activity = "Running";
        this.minutes = 0;
        this.date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }
    public FitnessTracker(String activity, int minutes, LocalDate date) {
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
    public String getActivity() {
        return activity;
    }
    public int getMinutes() {
        return minutes;
    }
    public LocalDate getDate() {
        return date;
    }
    public String toString() {
        return "Fitness Activity: " + activity + 
               ", Minutes: " + minutes + 
               ", Date: " + date;
    }
}
