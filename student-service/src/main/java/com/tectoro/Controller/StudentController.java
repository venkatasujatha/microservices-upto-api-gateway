package com.tectoro.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Model.Student;
import com.tectoro.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.saveStudent(student);
		
	}
	@GetMapping("/get/{id}")
	public Optional<Student> getStudent(@PathVariable int id)
	{
		return studentService.getStudent(id);
	}
}
