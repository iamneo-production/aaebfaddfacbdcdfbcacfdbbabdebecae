package com.example.springapp.controller;

import com.example.springapp.model.Student;
import com.example.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ApiController {

    @Autowired
    public ApiService apiService;

    @PostMapping("/")
    public boolean createStudent(@RequestBody Student student) {
        return apiService.createStudent(student);
    }

    @GetMapping("/{studentId}")
    public Student getOneLaptop(@PathVariable int studentId){
         return apiService.getOneStudent(studentId);
    }

    @GetMapping("/")
    public List<Student> getAllStudents() {
        return apiService.getAllStudents();
    }
}
