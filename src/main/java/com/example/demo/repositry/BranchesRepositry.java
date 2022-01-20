package com.example.demo.repositry;

import com.example.demo.entity.Branches;
import org.springframework.data.jpa.repository.JpaRepository;

//Branches Repository
public interface BranchesRepositry extends JpaRepository<Branches, Integer> {
}
