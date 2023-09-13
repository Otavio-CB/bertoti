public class Employee {
    private String name;
    private String officeJob;
    private String email;

    public Employee(String name, String officeJob, String email) {
        this.name = name;
        this.officeJob = officeJob;
        this.email = email;
    }

    // Getters (métodos de acesso)
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
