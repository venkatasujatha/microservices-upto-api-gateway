package com.tectoro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
