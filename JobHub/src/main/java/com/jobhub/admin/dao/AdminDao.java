package com.jobhub.admin.dao;

import java.util.List;
import java.util.Map;

import com.jobhub.admin.dto.AdminDto;
import com.jobhub.company.dto.CompanyMemberDto;
import com.jobhub.personal.dto.PersonalMemberDto;

public interface AdminDao {

	AdminDto adminExist(String id, String pwd);

	int memberSelectTotalCount();

	public void memberAllListPersonalUpdateOne(Map<String, Object> map);

	public void personalUpdateOne(Map<String, Object> map);

	public void companyUpdateOne(Map<String, Object> map);

	public List<PersonalMemberDto> memberSelectList();

	public void setResume();

	public void setRecommendRate();

	List<PersonalMemberDto> personalRecommendTotalRateAverageTop();

	List<CompanyMemberDto> companyRecommendTotalRateAverageTop();

	


}
