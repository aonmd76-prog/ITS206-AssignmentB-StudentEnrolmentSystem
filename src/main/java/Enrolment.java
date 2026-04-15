package main.java;

public class Enrolment {
    private Student student;
    private Course course;
    private String date;

    public Enrolment(Student student, Course course, String date) {

        // ✅ prerequisite check
        if (course.getPrerequisite().equals(student.getCompletedCourse())
                || course.getPrerequisite().equals("None")) {

            this.student = student;
            this.course = course;
            this.date = date;

            System.out.println("✅ Enrolment successful");

        } else {
            System.out.println("❌ Prerequisite not completed. Cannot enrol.");
        }
    }

    public void display() {
        if (student != null && course != null) {
            System.out.println("Student enrolled on " + date);
            student.display();
            course.display();
        }
    }
}