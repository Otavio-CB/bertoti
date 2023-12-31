public class Employee {
    private String name;
    private String officeJob;
    private String email;
    private String password;

    public Employee(String name, String officeJob, String email, String password) {
        this.name = name;
        this.officeJob = officeJob;
        this.email = email;
        this.password = password;
    }

    public boolean login(String username, String password) {
        if (this.email.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getOfficeJob() {
        return officeJob;
    }

    public String getEmail() {
        return email;
    }
}
