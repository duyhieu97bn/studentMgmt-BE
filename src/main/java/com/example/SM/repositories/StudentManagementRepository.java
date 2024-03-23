package com.example.SM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SM.Entities.StudentEntity;

public interface StudentManagementRepository extends JpaRepository<StudentEntity,Integer>{
    
}
