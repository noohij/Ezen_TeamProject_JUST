package com.jobhub.personal.service;

import java.util.List;
import java.util.Map;

import com.jobhub.personal.dto.CareerDto;
import com.jobhub.personal.dto.EducationDto;
import com.jobhub.personal.dto.LetterDto;
import com.jobhub.personal.dto.PersonalMemberDto;
import com.jobhub.personal.dto.ResumeDto;

public interface PersonalMemberService {
	
	public PersonalMemberDto personalMemberExist(String perId, String perPwd);

	public void personalInsertOne(PersonalMemberDto personalMemberDto) throws Exception;
	
	public int personalMemberSelectOne(int perNo);
	
	public PersonalMemberDto personalMemberSearchId(PersonalMemberDto personalMemberDto);
	
	public PersonalMemberDto personalMemberSearchPwd(PersonalMemberDto personalMemberDto);

	public void personalMemberNickNameUpdateOne(PersonalMemberDto personalMemberDto);
	
	public void personalMemberPasswordUpdateOne(PersonalMemberDto personalMemberDto);
	
	public void personalMemberPhoneNumUpdateOne(PersonalMemberDto personalMemberDto);
	
	public void personalMemberEmailUpdateOne(PersonalMemberDto personalMemberDto);
	
	public void personalMemberKeywordUpdateOne(PersonalMemberDto personalMemberDto);
	
	public Map<String, Object> personalMemberShowResume(int perNo);

	public void personalResumeAddOne(ResumeDto resumeDtoresumeDto
			, int perNo, List<EducationDto> educationDtoList, List<CareerDto>careerDtoList);
	
	public void personalResumeUpdateOne(ResumeDto resumeDtoresumeDto
			, int perNo, List<EducationDto> educationDtoList, List<CareerDto>careerDtoList);
	
	public LetterDto personalMembershowLetter(int perNo);

	public void PersonalLetterUpdateOne(LetterDto letterDto);

	public int personalUpdateTemporarily(PersonalMemberDto personalMemberDto);
	
	public int personalUpdatePermission(PersonalMemberDto personalMemberDto);	

//	public PersonalMemberDto personalMyPageList(HttpSession session);
	
}