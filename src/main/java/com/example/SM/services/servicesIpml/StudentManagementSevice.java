package com.example.SM.services.servicesIpml;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SM.Entities.StudentEntity;
import com.example.SM.dto.StudentDto;
import com.example.SM.repositories.StudentManagementRepository;
import com.example.SM.services.IStudentManagementService;

@Service
public class StudentManagementSevice implements IStudentManagementService {

  private final StudentManagementRepository studentManagementRepository;

  public StudentManagementSevice(StudentManagementRepository studentManagementRepository) {
    this.studentManagementRepository = studentManagementRepository;
  }

  @Override
  public List<StudentDto> getListStudents() {
    List a = this.studentManagementRepository.findAll();
    // List<StudentDto> list = new ArrayList<StudentDto>();
    return a;
  }

  @Override
  public boolean createStudent(StudentDto studentDto) {
    StudentEntity newStudent = StudentEntity.builder()
    .name(studentDto.getName())
    .address(studentDto.getAddress())
    .age(studentDto.getAge())
    .dob(studentDto.getDob())
    .sex(studentDto.getSex())
    .build();
    this.studentManagementRepository.save(newStudent);
    return true;
  }
}
