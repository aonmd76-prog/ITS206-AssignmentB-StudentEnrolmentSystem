package main.java;

// Main program
public class Main {
    public static void main(String[] args) {

        // Students
        Student s1 = new Student("S1", "Aon", "aon@email.com", "Java");
        Student s2 = new Student("S2", "John", "john@email.com", "None");

        // Courses
        Course c1 = new Course("C1", "Advanced Java", 2, "Java");
        Course c2 = new Course("C2", "Math", 3, "Java");

        // Enrolments
        Enrolment e1 = new Enrolment(s1, c1, "2026-04-14");
        Enrolment e2 = new Enrolment(s2, c2, "2026-04-14");

        // Display
        e1.display();
        System.out.println("----------------");
        e2.display();
    }
}