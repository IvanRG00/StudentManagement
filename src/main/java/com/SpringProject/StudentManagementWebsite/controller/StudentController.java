package com.SpringProject.StudentManagementWebsite.controller;

import com.SpringProject.StudentManagementWebsite.models.Student;
import com.SpringProject.StudentManagementWebsite.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private Studentrepository studentrepository;
    @PostMapping("/student")
    Student newStudent(@RequestBody Student newStudent){
        return studentrepository.save(newStudent);
    }
    @GetMapping("/students")
    List<Student> getallStudents(){
        return studentrepository.findAll();
    }



}
