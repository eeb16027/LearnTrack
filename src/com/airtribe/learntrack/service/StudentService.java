package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Student;
import com.airtribe.learntrack.exception.EntityNotFoundException;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findById(int id) throws EntityNotFoundException {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        throw new EntityNotFoundException("Student not found with ID: " + id);
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }
        students.forEach(System.out::println);
    }
}
