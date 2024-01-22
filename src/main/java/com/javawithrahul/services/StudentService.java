package com.javawithrahul.services;

import com.javawithrahul.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Integer id);

    void deleteStudentById(Integer id);

    Student updateStudent(Student student);


}
