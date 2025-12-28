package com.airtribe.learntrack.entity;

public class Student extends Person {
    private String batch;
    private boolean active;

    // Constructor Overloading
    public Student(int id, String firstName, String lastName, String batch) {
        super(id, firstName, lastName, null);
        this.batch = batch;
        this.active = true;
    }

    public Student(int id, String firstName, String lastName, String email, String batch) {
        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getDisplayName() {
        return "Student: " + super.getDisplayName();
    }

    public int getId() { return id; }
    public boolean isActive() { return active; }
    public void deactivate() { this.active = false; }

    @Override
    public String toString() {
        return id + " | " + getDisplayName() + " | Batch: " + batch + " | Active: " + active;
    }
}
