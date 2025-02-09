package com.itv.ITVWeekendSpringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itv.ITVWeekendSpringboot.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
