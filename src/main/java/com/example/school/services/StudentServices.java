package com.example.school.services;

import com.example.school.dao.StudentRepository;
import com.example.school.dto.Students;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {


    private final StudentRepository studentRepository;

    public StudentServices(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> getAllStudents() {
        return studentRepository.findAll();
    }

    public Object getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Students saveStudent(Students student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
