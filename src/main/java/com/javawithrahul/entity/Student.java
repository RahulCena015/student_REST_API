package com.javawithrahul.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Student_Table")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentId;
    private String studentName;
    private String email;
    private String department;


}
