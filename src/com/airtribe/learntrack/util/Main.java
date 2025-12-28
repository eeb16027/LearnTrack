package com.airtribe.learntrack.util;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.*;
import com.airtribe.learntrack.util.IdGenerator;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== LearnTrack Application Started ===");

        // Services
        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        // -------------------------------
        // Add Students (Constant Values)
        // -------------------------------
        Student s1 = new Student(
                IdGenerator.getNextStudentId(),
                "Rahul",
                "Sharma",
                "Java-2024"
        );

        Student s2 = new Student(
                IdGenerator.getNextStudentId(),
                "Anita",
                "Verma",
                "Java-2024"
        );

        studentService.addStudent(s1);
        studentService.addStudent(s2);

        System.out.println("\n--- Students Added ---");
        studentService.listStudents();

        // -------------------------------
        // Add Courses (Constant Values)
        // -------------------------------
        Course c1 = new Course(
                IdGenerator.getNextCourseId(),
                "Core Java",
                "Java fundamentals",
                12
        );

        Course c2 = new Course(
                IdGenerator.getNextCourseId(),
                "DSA",
                "Data Structures & Algorithms",
                16
        );

        courseService.addCourse(c1);
        courseService.addCourse(c2);

        System.out.println("\n--- Courses Added ---");
        courseService.listCourses();

        // -------------------------------
        // Enroll Students
        // -------------------------------
        Enrollment e1 = new Enrollment(
                IdGenerator.getNextEnrollmentId(),
                s1.getId(),
                c1.getId()
        );

        Enrollment e2 = new Enrollment(
                IdGenerator.getNextEnrollmentId(),
                s2.getId(),
                c2.getId()
        );

        enrollmentService.enroll(e1);
        enrollmentService.enroll(e2);

        System.out.println("\n--- Enrollments ---");
        enrollmentService.listEnrollments();

        System.out.println("\n=== LearnTrack Application Finished ===");
    }
}
