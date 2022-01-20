package com.example.demo.dto;

import com.example.demo.entity.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Institute Data Transfer Object Class
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Insdto {

    private Teacher teacher;
}
