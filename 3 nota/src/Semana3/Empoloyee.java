package company.hr;

public class Employee {
    public String name;
    protected String role;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void increaseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}   