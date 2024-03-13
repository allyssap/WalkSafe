package app;
import java.util.Date;

/**
  *
  * @author drewse / Andrew Scott
  * 
  */

// PlatformUser class representing platform users
class PlatformUser extends Users {
    private boolean subscriptionStatus;
    private Date lastLogin;

    // Constructor
    public PlatformUser(String userId, String username, String email, String password, Preferences preferences,
                        boolean subscriptionStatus, Date lastLogin) {
        super(userId, username, email, password, preferences);
        this.subscriptionStatus = subscriptionStatus;
        this.lastLogin = lastLogin;
    }

    // Getter and setter methods specific to PlatformUser
    public void setSubscriptionStatus(boolean subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public boolean getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    // Method specific to PlatformUser
    public void performPlatformUserTask() {
        // Implementation code for platform user task
    }
