package com.crud.operation.repository;

import com.crud.operation.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    public Student saveStudent(Student studentreqq){
        System.out.println("inside repository");
        System.out.println("exiting repository");
        return null;
    }

}
