package com.tectoro.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tectoro.Model.Student;
import com.tectoro.Repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	
	private StudentRepository repository;

	@Override
	public Student saveStudent(Student student) {

		return repository.save(student);
	}

	@Override
	public Optional<Student> getStudent(int id) {
		
		
		return repository.findById(id);
	}

	

}
