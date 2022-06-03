package com.tectoro.VO;

import com.tectoro.Model.Subject;

public class ResponseTemplateVo {
	
	private Student student;
	private Subject subject;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ResponseTemplateVo(Student student, Subject subject) {
		super();
		this.student = student;
		this.subject = subject;
	}
	public ResponseTemplateVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseTemplateVo [student=" + student + ", subject=" + subject + "]";
	}
	
	

}
