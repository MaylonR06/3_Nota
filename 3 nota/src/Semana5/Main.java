package Semana5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Frank", 85.5);
        Student student2 = new Student("Maylon", 92.0);

        System.out.println(student1.name + " has a grade of " + student1.grade);
        System.out.println(student2.name + " has a grade of " + student2.grade);
    }
}
