package app;

/**
  *
  * @author drewse / Andrew Scott
  * 
  */

// CompanyUser class representing company workers
class CompanyUser extends Users {
    private String jobTitle;
    private String department;

    // Constructor
    public CompanyUser(String userId, String username, String email, String password, Preferences preferences,
                         String jobTitle, String department) {
        super(userId, username, email, password, preferences);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    // Getter and setter methods specific to CompanyUser
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    // Method specific to CompanyUser
    public void performCompanyUserTask() {
        // Implementation code for company user task
    }
}
