package com.crud.operation.controller;

import com.crud.operation.entity.Student;
import com.crud.operation.service.StudentService;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student, HttpMethod httpMethod){
        System.out.println("inside controller");
        Student creteStudent = studentService.createStudent(student);
        System.out.println("exiting controller");
        return ResponseEntity.status(HttpStatus.CREATED).body(creteStudent);
    }
}
