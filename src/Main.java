package main.java;

public class Main {
    public static void main(String[] args) {

        // Create students
        Student s1 = new Student("S1", "Aon", "aon@email.com", "Java");
        Student s2 = new Student("S2", "John", "john@email.com", "None");
        // Create courses
        Course c1 = new Course("C1", "Advanced Java", 2, "Java");
        Course c2 = new Course("C2", "Math", 3, "None");
        // Create enrolments
        Enrolment e1 = new Enrolment(s1, c1, "2026-04-14");
        Enrolment e2 = new Enrolment(s2, c2, "2026-04-14");

        // Display enrolments
        e1.display();
        System.out.println("----------------");
        e2.display();
    }
}