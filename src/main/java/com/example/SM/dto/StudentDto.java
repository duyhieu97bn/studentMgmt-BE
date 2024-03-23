package com.example.SM.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private String name;
    private int age;
    private String dob;
    private String address;
    private String sex;
}
