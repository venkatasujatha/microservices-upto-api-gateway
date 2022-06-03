package com.tectoro.Service;

import java.util.Optional;

import com.tectoro.Model.Student;

public interface StudentService {

	

	Optional<Student> getStudent(int id);

	Student saveStudent(Student student);

}
