package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;

import java.util.ArrayList;

public class EnrollmentService {
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    public void enroll(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public void listEnrollments() {
        enrollments.forEach(System.out::println);
    }
}
