import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private String profilePicture; // URL or path to the profile picture
    private String bio; // Short bio or description
    private List<Activity> activities; // List of activities by the user
    private List<User> following; // Users that this user follows
    private List<User> followers; // Users that follow this user
    private double totalDistance; // Total distance covered by the user
    private int totalActivities; // Total number of activities
    private boolean isPublic; // Profile visibility
    private List<String> achievements; // List of achievements or badges

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.activities = new ArrayList<>();
        this.following = new ArrayList<>();
        this.followers = new ArrayList<>();
        this.totalDistance = 0.0;
        this.totalActivities = 0;
        this.isPublic = true; // Default to public
        this.achievements = new ArrayList<>();
    }

    public void register() {
        // Code to register the user
    }

    public void login() {
        // Code to log in the user
    }

    public void updateProfile() {
        // Code to update user profile
    }

    public void followUser(User user) {
        if (!following.contains(user)) {
            following.add(user);
            user.addFollower(this); // Add this user to the followed user's followers
        }
    }

    public void addFollower(User user) {
        if (!followers.contains(user)) {
            followers.add(user);
        }
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
        totalDistance += activity.getDistance(); // Assuming Activity has a getDistance method
        totalActivities++;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPrivacy(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public void addAchievement(String achievement) {
        achievements.add(achievement);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getBio() {
        return bio;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public int getTotalActivities() {
        return totalActivities;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public List<String> getAchievements() {
        return achievements;
    }
}
