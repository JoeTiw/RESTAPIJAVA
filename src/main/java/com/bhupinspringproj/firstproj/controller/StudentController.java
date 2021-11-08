package com.bhupinspringproj.firstproj.controller;

import com.bhupinspringproj.firstproj.model.Student;
import com.bhupinspringproj.firstproj.service.StudentService;
import com.bhupinspringproj.firstproj.service.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/student")
@CrossOrigin

public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.savingStudent(student);
        return "New Student added";
    }
    @GetMapping ("/getAll")
    public List <Student> getAllStudents() {
        return studentService.getAllStudents();

    }
}
