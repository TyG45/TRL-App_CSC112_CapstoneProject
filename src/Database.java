import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<User> users; // List to store users
    private List<Activity> activities; // List to store activities
    private List<String> locations; // List to store running locations

    public Database() {
        this.users = new ArrayList<>();
        this.activities = new ArrayList<>();
        this.locations = new ArrayList<>(); // Initialize locations list
    }

    // Method to read locations from a file
    public void loadLocationsFromFile(String fileName) {
        try {
            locations = Files.readAllLines(Paths.get(fileName)); // Read all lines into the locations list
        } catch (IOException e) {
            System.err.println("Error reading locations file: " + e.getMessage());
        }
    }

    // Method to get the list of locations
    public List<String> getLocations() {
        return locations; // Return the list of locations
    }

    // Method to add a user to the database
    public void addUser(User user) {
        users.add(user);
    }

    // Method to retrieve a user by username
    public User getUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user; // Return the user if found
            }
        }
        return null; // Return null if user not found
    }

    // Method to add an activity to the database
    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    // Method to retrieve all activities
    public List<Activity> getAllActivities() {
        return activities; // Return the list of all activities
    }

    // Method to retrieve activities by a specific user
    public List<Activity> getActivitiesByUser(User user) {
        List<Activity> userActivities = new ArrayList<>();
        for (Activity activity : activities) {
            if (activity.getUsername().equals(user)) {
                userActivities.add(activity);
            }
        }
        return userActivities; // Return the list of activities for the user
    }
}
