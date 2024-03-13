package app;

/**
  *
  * @author drewse / Andrew Scott
  * 
  */

import java.util.Date;

// Users class representing common attributes and methods for all users
class Users {
    private String userId;
    private String username;
    private String email;
    private String password;
    private Preferences preferences;

    // Constructor
    public Users(String userId, String username, String email, String password, Preferences preferences) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.preferences = preferences;
    }

    // Getter and setter methods
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    public Preferences getPreferences() {
        return preferences;
    }

    // Method to report a hazard
    public void reportHazard(Hazard hazard) {
        // Implementation code to report a hazard
    }
}
