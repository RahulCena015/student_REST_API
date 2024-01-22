package com.javawithrahul.services;

import com.javawithrahul.entity.Student;
import com.javawithrahul.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(()->new RuntimeException("There is no Student with this given id "+ id));
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);

    }

    @Override
    public Student updateStudent(Student student) {
        Student existingStudent =studentRepository.findById(student.getStudentId())
                .orElseThrow(()->new RuntimeException("There is no record with this given student id"+student.getStudentId()));
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setDepartment(student.getDepartment());
        studentRepository.save(existingStudent);
        return existingStudent;
    }

}
