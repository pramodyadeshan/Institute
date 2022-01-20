package com.example.demo.repositry;

import com.example.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

//Teacher Repository
public interface TeacherRepositry extends JpaRepository<Teacher, Integer> {
}
