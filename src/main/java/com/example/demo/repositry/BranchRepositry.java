package com.example.demo.repositry;

import com.example.demo.entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

//Branches Repository
public interface BranchRepositry extends JpaRepository<Branch, Integer> {
}
