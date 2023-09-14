package com.jobhub.company.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobhub.company.dao.CompanyMemberDao;
import com.jobhub.company.dto.CompanyMemberDto;
import com.jobhub.company.service.CompanyMemberServiceImpl;

@Service
public class CompanyMemberServiceImpl implements CompanyMemberService {

	private static final Logger log = LoggerFactory.getLogger(CompanyMemberServiceImpl.class);
	
	@Autowired
	public CompanyMemberDao companyMemberDao;

	@Override
	public CompanyMemberDto companyMemberExist(String cCode, String cPwd) {
		// TODO Auto-generated method stub
		return companyMemberDao.companyMemberExist(cCode, cPwd);
	}
	
	
}