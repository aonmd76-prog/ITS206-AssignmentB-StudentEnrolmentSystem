package main.java;

// Student class
public class Student {
    private String id;
    private String name;
    private String email;
    private String completedCourse;

    public Student(String id, String name, String email, String completedCourse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.completedCourse = completedCourse;
    }

    public String getCompletedCourse() {
        return completedCourse;
    }

    // setters (for encapsulation requirement)
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void display() {
        System.out.println(id + " " + name + " " + email);
    }
}
