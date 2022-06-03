package com.tectoro.Service;

import java.util.Optional;

import com.tectoro.Model.Subject;
import com.tectoro.VO.ResponseTemplateVo;

public interface SubjectInterface {

	Subject saveSubject(Subject subject);

	/* Optional<Subject> getSubject(int id); */

	ResponseTemplateVo getsubjectwithStudent(int sid);

}
