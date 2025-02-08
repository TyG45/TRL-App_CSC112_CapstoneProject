public class Activity {
    private String type; // e.g., "run", "bike"
    private double distance; // Distance in miles
    private double duration; // Duration in minutes
    private int pace; // Pace in min per mile

    public Activity(String type, double distance, double duration) {
        this.type = type;
        this.distance = distance;
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }

    public int getPace() {
        return pace;
    }

    // Additional methods can be added as needed
}
