package com.gt.dao;


import com.gt.model.Student;

public interface RegistrationDAO {
    public Long persistStudent(Student student);
    public Student findById(Long id);
}