package com.example.demo.controller;

import com.example.demo.dto.Insdto;
import com.example.demo.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositry.BranchesRepositry;
import com.example.demo.repositry.TeacherRepositry;

import java.util.List;

//Controller

@RestController
@RequestMapping(value = "api/v1/institute")
public class InsController
{
    @Autowired
    private TeacherRepositry teacherRepositry;

    @Autowired
    private BranchesRepositry branchesRepositry;

    //Save Data
    @PostMapping("/saveData")
    public Teacher saveData(@RequestBody Insdto request)
    {
        return teacherRepositry.save(request.getTeacher());
    }

    //View Data
    @GetMapping("/findAllData")
    public List<Teacher> findAllData()
    {
        return teacherRepositry.findAll();
    }
}
