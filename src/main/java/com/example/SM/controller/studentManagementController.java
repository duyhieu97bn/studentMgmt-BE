package com.example.SM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SM.Entities.StudentEntity;
import com.example.SM.dto.StudentDto;
import com.example.SM.services.servicesIpml.StudentManagementSevice;

/**
 * studentManagementController
 */
@RestController
@RequestMapping("/")
public class studentManagementController {
    @Autowired
    private StudentManagementSevice studentManagementSevice;

    @GetMapping("/get-list-students")
    public List<StudentDto> getListStudents() {
        List<StudentDto> list = studentManagementSevice.getListStudents();
        return list;
    }

    @PostMapping("create-student")
    public boolean createStudent(@RequestBody StudentDto studentDto){
        boolean response = studentManagementSevice.createStudent(studentDto);
        return response;
    }
}