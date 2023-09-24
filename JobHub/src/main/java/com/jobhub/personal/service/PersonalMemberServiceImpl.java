package com.jobhub.personal.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jobhub.personal.dao.PersonalMemberDao;
import com.jobhub.personal.dto.LetterDto;
import com.jobhub.personal.dto.PersonalMemberDto;
import com.jobhub.personal.dto.ResumeDto;

@Service
public class PersonalMemberServiceImpl implements PersonalMemberService {
	
	private static final Logger log = LoggerFactory.getLogger(PersonalMemberService.class);
	
	@Autowired
	public PersonalMemberDao personalMemberDao;

	@Override
	public PersonalMemberDto personalMemberExist(String pId, String pPwd) {
		// TODO Auto-generated method stub
		
		return personalMemberDao.personalMemberExist(pId, pPwd);
	}

	@Override
	public void personalInsertOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.memberInsertOne(personalMemberDto);
	}

	@Override
	public int personalMemberSelectOne(int pNo) {
		// TODO Auto-generated method stub
		return personalMemberDao.memberSelectOne(pNo);
	}

	@Override
	public PersonalMemberDto personalMemberSearchId(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		return personalMemberDao.personalMemberSearchId(personalMemberDto);
	}
	
	@Override
	public PersonalMemberDto personalMemberSearchPwd(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		return personalMemberDao.personalMemberSearchPwd(personalMemberDto);
	}
	
	@Override
	public void personalMemberNickNameUpdateOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.personalMemberNickNameUpdateOne(personalMemberDto);
	}

	@Override
	public void personalMemberPasswordUpdateOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.personalMemberPasswordUpdateOne(personalMemberDto);
	}

	@Override
	public void personalMemberPhoneNumUpdateOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.personalMemberPhoneNumUpdateOne(personalMemberDto);
	}

	@Override
	public void personalMemberEmailUpdateOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.personalMemberEmailUpdateOne(personalMemberDto);
	}

	@Override
	public void personalMemberKeywordUpdateOne(PersonalMemberDto personalMemberDto) {
		// TODO Auto-generated method stub
		personalMemberDao.personalMemberKeywordUpdateOne(personalMemberDto);
	}

	@Override
	public ResumeDto personalMemberShowResume(int pNo) {
		// TODO Auto-generated method stub
		
		return personalMemberDao.personalMemberShowResume(pNo);
	}

	@Override
	public void PersonalresumeUpdateOne(ResumeDto resumeDto) {
		// TODO Auto-generated method stub
		personalMemberDao.PersonalresumeUpdateOne(resumeDto);
	}

	@Override
	public LetterDto personalMembershowLetter(int pNo) {
		// TODO Auto-generated method stub
		return personalMemberDao.personalMembershowLetter(pNo);
	}

	@Override
	public void PersonalLetterUpdateOne(LetterDto letterDto) {
		// TODO Auto-generated method stub
		personalMemberDao.PersonalLetterUpdateOne(letterDto);
	}

}
