package com.pratyush.billing_service.service;

import org.springframework.stereotype.Service;

import com.pratyush.billing_service.entity.Student;
import com.pratyush.billing_service.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}