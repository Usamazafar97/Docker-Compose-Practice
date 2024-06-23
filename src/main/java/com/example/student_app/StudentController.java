package com.example.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    @RequestMapping("/addStudent")
    public void addStudent(){

        Student student = new Student();
        student.setName("usama");
        student.setAge(25);

        // save the record to the DB
        studentRepo.save(student);
    }
}
