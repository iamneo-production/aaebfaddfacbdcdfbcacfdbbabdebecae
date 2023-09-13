package com.example.springapp.service;

import com.example.springapp.model.Student;
import com.example.springapp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ApiService {
  
    @Autowired
    public StudentRepo studentRepo;
 

    public boolean createStudent(Student student) {
        studentRepo.save(student);
        return true;
    }

    public Student getOneStudent(int studentId) {
        return studentRepo.findById(studentId).get();
      }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
