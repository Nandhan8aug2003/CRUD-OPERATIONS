package com.crud.operation.service;

import com.crud.operation.entity.Student;
import com.crud.operation.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq){
        // bassic
        System.out.println("inside service");
        Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("exiting service");
        return studentResp;
    }

}
