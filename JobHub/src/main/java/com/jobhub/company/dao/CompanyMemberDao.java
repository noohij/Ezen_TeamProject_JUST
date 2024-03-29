package com.jobhub.company.dao;

import java.util.List;
import java.util.Map;

import com.jobhub.company.dto.CompanyMemberDto;

public interface CompanyMemberDao {

	public CompanyMemberDto companyMemberExist(String comCode, String comPwd);
	
	public CompanyMemberDto showCompanyInfo(int comNo);
	
	public CompanyMemberDto companyMemberSelectOne(int comNo);

	public int companyInsertOne(CompanyMemberDto companyMemberDto);

	public List<CompanyMemberDto> companyMemberSelectList(Map<String, Object> map);

	public int companyMemberSelectTotalCount();
	
	public CompanyMemberDto companyMemberSearchId(CompanyMemberDto companyMemberDto);

	public CompanyMemberDto companyMemberSearchPwd(CompanyMemberDto companyMemberDto);
	
	public void companyInfoUpdateOne(CompanyMemberDto companyMemberDto);

	public List<CompanyMemberDto> companyMemSelectList();

	public void preferUpdateOne(Map<String, Object> map);

	public int companyUpdateId(CompanyMemberDto companyMemberDto);
	
	public int companyUpdatePermission(CompanyMemberDto companyMemberDto);
}
