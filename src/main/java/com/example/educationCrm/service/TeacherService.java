package com.example.educationCrm.service;

import com.example.educationCrm.model.entity.Lesson;
import com.example.educationCrm.model.entity.Teacher;

import java.util.List;

public interface TeacherService {

    void save(Teacher teacher);
    void update(Teacher teacher);
    void delete(Teacher teacher);
    List<Teacher> findAll();

    Teacher withStudents(Long id) throws Exception;
    List<Teacher> findTeacherByLesson(Lesson lesson);
}
