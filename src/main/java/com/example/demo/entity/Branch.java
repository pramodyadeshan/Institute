package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor

//Branches Entity
public class Branch implements Serializable
{
    //Create table columns
    @Id
    private Long branchId;
    private String branchName;
    private String branchTp;

    //Create One to Many relationship
    @OneToMany(targetEntity = Teacher.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "BranchId",referencedColumnName = "branchId")
    private List<Teacher> teachers;
}
