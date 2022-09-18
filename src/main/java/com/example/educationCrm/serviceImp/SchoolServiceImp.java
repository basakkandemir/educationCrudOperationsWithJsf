package com.example.educationCrm.serviceImp;

import com.example.educationCrm.model.entity.School;
import com.example.educationCrm.repository.SchoolRepository;
import com.example.educationCrm.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImp implements SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;

    @Transactional
    @Override
    public void save(School school) {
        this.schoolRepository.save(school);
    }

    @Transactional
    @Override
    public void update(School school) {
        this.schoolRepository.save(school);

    }

    @Transactional
    @Override
    public void delete(School school) {
        this.schoolRepository.delete(school);
    }

    @Override
    public School findByName(String name) {
        return this.schoolRepository.findSchoolByName(name);
    }


    @Transactional(readOnly = true)
    @Override
    public List<School> findAll(){
        return this.schoolRepository.findAll();
    }

}
