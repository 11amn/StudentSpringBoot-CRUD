package com.kodnest.StudentSpringBootCRUD.controller;

import com.kodnest.StudentSpringBootCRUD.entity.Student;
import com.kodnest.StudentSpringBootCRUD.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    StudentService studService;

    public StudentController(StudentService studService) {
        this.studService = studService;
    }

    @PostMapping("/create")
    public String create(@RequestBody Student st) {
        studService.createStudent(st);
        return "Student is SAVED";
    }

    @GetMapping("/get/{roll}")
    public Student get(@PathVariable int roll) {
        return studService.getStudent(roll);
    }
    @GetMapping("/getAll")
    public List<Student> getAll() {
        return studService.getAllStudents();
    }
    @PutMapping("/update/{roll}")
    public String update(@PathVariable int roll, @RequestBody Student st) {
        st.setRoll(roll);
        studService.updateStudent(st);
        return "Student is UPDATED";
    }
    @DeleteMapping("/delete/{roll}")
    public String  delete(@PathVariable int roll) {
        studService.deleteStudent(roll);
        return "Student is DELETED";
    }
}
