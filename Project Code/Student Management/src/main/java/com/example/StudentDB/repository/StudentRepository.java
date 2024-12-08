package com.example.StudentDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentDB.domain.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
