package com.kodnest.StudentSpringBootCRUD.repository;

import com.kodnest.StudentSpringBootCRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
