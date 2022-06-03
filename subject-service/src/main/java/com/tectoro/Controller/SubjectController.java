package com.tectoro.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tectoro.Model.Subject;
import com.tectoro.Service.SubjectInterface;
import com.tectoro.VO.ResponseTemplateVo;

@RestController
@RequestMapping("/subject")
public class SubjectController {

	@Autowired
	private SubjectInterface subjectInterface;
	@PostMapping("/login")
	public ResponseEntity<String> saveSubject(@RequestBody Subject subject)
	{
		subjectInterface.saveSubject(subject);
		return ResponseEntity.ok("saved");
	}

	/*
	 * @GetMapping("/find/{id}") public Optional<Subject> getSubject(@PathVariable
	 * int id) {
	 * 
	 * return subjectInterface.getSubject(id); }
	 */@GetMapping("/{sid}")
	public ResponseTemplateVo getsubjectwithStudent(@PathVariable int sid)
	{
		return subjectInterface.getsubjectwithStudent(sid);
	}
}
