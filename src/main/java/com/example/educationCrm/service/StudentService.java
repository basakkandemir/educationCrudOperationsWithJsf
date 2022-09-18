package com.example.educationCrm.service;

import com.example.educationCrm.model.entity.Student;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
    void save(Student student);

    void update(Student student);
    void delete(Student student);

    Student findById(Long id);

    List<Student> findAllStudent();

    List<Student> findAll();
}
