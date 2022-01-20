package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//Teacher Entity
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Teacher implements Serializable
{
    //Create table columns
    @Id
    @GeneratedValue //Auto generate ID
    private Long id;
    private String teacherName;
    private String teacherTp;
    private String teacherAddress;
    private String teacherGender;
}
