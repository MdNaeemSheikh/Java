public SupportStaff(int employeeID, String name, double salary, String jobTitle) {
        super(employeeID, name, salary);
        this.jobTitle = jobTitle;
        }

public String getJobTitle() {
        return jobTitle;
        }

public String toString() {
        return super.toString() + " Job Title: " + jobTitle;
        }
        }