package com.pratyush.billing_service.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.pratyush.billing_service.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}