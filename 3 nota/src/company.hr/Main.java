package company.main;

import company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.name = "John";
        emp1.setRole("Maylon");
        emp1.setSalary(4000);

        emp2.name = "Maria";
        emp2.setRole("Yisus");
        emp2.setSalary(5500);

        System.out.println(emp1.name + " - " + emp1.getRole() + " - $" + emp1.getSalary());
        System.out.println(emp2.name + " - " + emp2.getRole() + " - $" + emp2.getSalary());
    }
}