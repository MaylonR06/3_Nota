package company.main;

import company.hr.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.name = "Alice";
        emp1.role = "Developer";
        emp1.setSalary(5000);

        emp2.name = "Bob";
        emp2.role = "Manager";
        emp2.setSalary(7000);

        System.out.println(emp1.name + " - " + emp1.role + " - $" + emp1.getSalary());
        System.out.println(emp2.name + " - " + emp2.role + " - $" + emp2.getSalary());
    }
}

