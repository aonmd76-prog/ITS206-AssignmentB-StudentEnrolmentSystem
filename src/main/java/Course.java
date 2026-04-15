package main.java;

// Course class
public class Course {
    private String code;
    private String name;
    private int capacity;
    private String prerequisite;

    public Course(String code, String name, int capacity, String prerequisite) {
        this.code = code;
        this.name = name;
        this.capacity = capacity;
        this.prerequisite = prerequisite;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void display() {
        System.out.println(code + " " + name + " Capacity: " + capacity);
    }
}