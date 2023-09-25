package com.jobhub.company.service;

import java.util.List;
import java.util.Map;

import com.jobhub.company.dto.CompanyMemberDto;
import com.jobhub.personal.dto.PersonalMemberDto;

public interface CompanyMemberService {

	public CompanyMemberDto companyMemberExist(String cCode, String cPwd);

	public void companyInsertOne(CompanyMemberDto companyMemberDto);

	public List<PersonalMemberDto> personalInfoList(Map<String, Object> map);
	
	public void companyMembercInChargeNameUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercInChargeEmailUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercInChargePhoneNumUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercNameUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercAddUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercTypeUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercEstDateUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercHomepageUpdateOne(CompanyMemberDto companyMemberDto);
	
	public void companyMembercIntroduceUpdateOne(CompanyMemberDto companymemberDto);

	public CompanyMemberDto companyMemberSelectOne(int cNo);

	public void preferUpdateOne(Map<String, Object> map);
	
}
