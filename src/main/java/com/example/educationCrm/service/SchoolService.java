package com.example.educationCrm.service;

import com.example.educationCrm.model.entity.School;

import java.util.List;

public interface SchoolService {
    public void save(School school);
    public void update(School school);
    public void delete(School school);

    public School findByName(String name);

    public List<School> findAll();

}
