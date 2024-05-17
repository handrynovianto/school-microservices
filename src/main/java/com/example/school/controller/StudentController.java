package com.example.school.controller;


import com.example.school.dto.Students;
import com.example.school.services.StudentServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping
    public List<Students> getAllStudents() {
        return studentServices.getAllStudents();
    }

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id) {
        return (Students) studentServices.getStudentById(id);
    }

    @PostMapping
    public Students saveStudent(@RequestBody Students students) {
        return studentServices.saveStudent(students);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentServices.deleteStudent(id);
    }
}
