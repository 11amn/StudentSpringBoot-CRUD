package com.kodnest.StudentSpringBootCRUD.service;

import com.kodnest.StudentSpringBootCRUD.entity.Student;
import com.kodnest.StudentSpringBootCRUD.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studRepo;

    public StudentService(StudentRepository studRepo) {
        this.studRepo = studRepo;
    }

    public void createStudent(Student st) {
        studRepo.save(st);
    }

    public Student getStudent(int roll) {
        Student st = studRepo.findById(roll).orElse(null);
        return st;
    }

    public List<Student> getAllStudents() {
        List<Student> studList = studRepo.findAll();
        return studList;
    }

    public void updateStudent(Student st) {
        studRepo.save(st);
    }

    public void deleteStudent(int roll) {
        studRepo.deleteById(roll);
    }

    public Student getStudentByEmail(String email) {
        Student st = studRepo.findByEmail(email);
        return st;
    }
}
