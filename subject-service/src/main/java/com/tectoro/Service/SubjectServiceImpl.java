package com.tectoro.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tectoro.Model.Subject;
import com.tectoro.Repository.SubjectRepository;
import com.tectoro.VO.ResponseTemplateVo;
import com.tectoro.VO.Student;

@Service
public class SubjectServiceImpl implements SubjectInterface {
	
	@Autowired
	private SubjectRepository subjectRepository;
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Subject saveSubject(Subject subject) {
		return subjectRepository.save(subject);
		
	}

	/*
	 * @Override public Optional<Subject> getSubject(int id) { return
	 * subjectRepository.findById(id);
	 * 
	 * }
	 */

	@Override
	public ResponseTemplateVo getsubjectwithStudent(int sid) {
		
		ResponseTemplateVo vo=new ResponseTemplateVo();
		
		Subject subject2=subjectRepository.findById(sid).get();
		Student student=this.restTemplate.getForObject("http://localhost:9001/student/get/"+subject2.getId(),Student.class);
		vo.setSubject(subject2);
		vo.setStudent(student);
		
		return vo;
	}

	

}
