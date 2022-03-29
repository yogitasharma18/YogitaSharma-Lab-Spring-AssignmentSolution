package com.greatLearning.studentmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.studentmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}