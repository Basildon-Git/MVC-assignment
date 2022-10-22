package com.mvc.controller;

import com.mvc.model.student;

public interface studentDAO {
    void createStudent(student st);
    void updateStudent(student st);
    void deleteStudent(String username);
    boolean isStudentExisting(String fname, String sname, String uname);
    boolean loginStudent(String fname, String sname); 
    student getStudent(String uname);
}
