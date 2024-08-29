package com.nagarro.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.studentcrud.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
