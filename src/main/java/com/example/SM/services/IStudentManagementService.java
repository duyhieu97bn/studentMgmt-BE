package com.example.SM.services;

import java.util.List;

import com.example.SM.dto.*;

public interface IStudentManagementService {
    
    List<StudentDto> getListStudents();
    boolean createStudent(StudentDto studentDto);
}
