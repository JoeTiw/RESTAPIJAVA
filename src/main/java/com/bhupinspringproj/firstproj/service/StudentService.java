package com.bhupinspringproj.firstproj.service;

import com.bhupinspringproj.firstproj.model.Student;

import java.util.List;

public interface StudentService {
    public Student savingStudent (Student student);
    public List<Student> getAllStudents();
}
