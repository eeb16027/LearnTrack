package com.airtribe.learntrack.entity;

import java.time.LocalDate;

public class Enrollment {
    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private String status;

    public Enrollment(int id, int studentId, int courseId) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = LocalDate.now();
        this.status = "ACTIVE";
    }

    public void complete() {
        status = "COMPLETED";
    }

    @Override
    public String toString() {
        return "Enrollment ID: " + id +
                ", Student: " + studentId +
                ", Course: " + courseId +
                ", Status: " + status;
    }
}
