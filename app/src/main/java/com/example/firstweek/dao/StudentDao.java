package com.example.firstweek.dao;

import com.example.firstweek.Student;
import com.example.firstweek.*Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectAllStudent();
    void insert(Student student);
    void updata(Student student);
    void delete(String studentName);
}
