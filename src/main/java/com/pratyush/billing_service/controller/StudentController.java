package com.pratyush.billing_service.controller;

import org.springframework.web.bind.annotation.*;

import com.pratyush.billing_service.entity.Student;
import com.pratyush.billing_service.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
}
