package com.jobhub.admin.dto;

import java.util.Date;

public class AdminDto {

	private int pNo;
	private String pName;
	private String pId;
	private String pPwd;
	private String pPhoneNum;
	private String pCom;
	private String pNickname;
	private String pProfile;
	private String pEmail;
	private Date pHireDate;
	private String pKeyword;
	private String pTemporarily;
	private int pPermission;
	private Date pCreateDate;
	private Date pModifyDate;
	private Date pConnectionTime;
	private Date pDisconnectionTime;
	
	public AdminDto() {
		super();
	}

	public AdminDto(int pNo, String pName, String pId, String pPwd
			, String pPhoneNum, String pCom, String pNickname
			, String pProfile, String pEmail, Date pHireDate, String pKeyword
			, String pTemporarily, int pPermission, Date pCreateDate
			, Date pModifyDate, Date pConnectionTime, Date pDisconnectionTime) {
		super();
		this.pNo = pNo;
		this.pName = pName;
		this.pId = pId;
		this.pPwd = pPwd;
		this.pPhoneNum = pPhoneNum;
		this.pCom = pCom;
		this.pNickname = pNickname;
		this.pProfile = pProfile;
		this.pEmail = pEmail;
		this.pHireDate = pHireDate;
		this.pKeyword = pKeyword;
		this.pTemporarily = pTemporarily;
		this.pPermission = pPermission;
		this.pCreateDate = pCreateDate;
		this.pModifyDate = pModifyDate;
		this.pConnectionTime = pConnectionTime;
		this.pDisconnectionTime = pDisconnectionTime;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpPwd() {
		return pPwd;
	}

	public void setpPwd(String pPwd) {
		this.pPwd = pPwd;
	}

	public String getpPhoneNum() {
		return pPhoneNum;
	}

	public void setpPhoneNum(String pPhoneNum) {
		this.pPhoneNum = pPhoneNum;
	}

	public String getpCom() {
		return pCom;
	}

	public void setpCom(String pCom) {
		this.pCom = pCom;
	}

	public String getpNickname() {
		return pNickname;
	}

	public void setpNickname(String pNickname) {
		this.pNickname = pNickname;
	}

	public String getpProfile() {
		return pProfile;
	}

	public void setpProfile(String pProfile) {
		this.pProfile = pProfile;
	}

	public String getpEmail() {
		return pEmail;
	}

	public void setpEmail(String pEmail) {
		this.pEmail = pEmail;
	}

	public Date getpHireDate() {
		return pHireDate;
	}

	public void setpHireDate(Date pHireDate) {
		this.pHireDate = pHireDate;
	}

	public String getpKeyword() {
		return pKeyword;
	}

	public void setpKeyword(String pKeyword) {
		this.pKeyword = pKeyword;
	}

	public String getpTemporarily() {
		return pTemporarily;
	}

	public void setpTemporarily(String pTemporarily) {
		this.pTemporarily = pTemporarily;
	}

	public int getpPermission() {
		return pPermission;
	}

	public void setpPermission(int pPermission) {
		this.pPermission = pPermission;
	}

	public Date getpCreateDate() {
		return pCreateDate;
	}

	public void setpCreateDate(Date pCreateDate) {
		this.pCreateDate = pCreateDate;
	}

	public Date getpModifyDate() {
		return pModifyDate;
	}

	public void setpModifyDate(Date pModifyDate) {
		this.pModifyDate = pModifyDate;
	}

	public Date getpConnectionTime() {
		return pConnectionTime;
	}

	public void setpConnectionTime(Date pConnectionTime) {
		this.pConnectionTime = pConnectionTime;
	}

	public Date getpDisconnectionTime() {
		return pDisconnectionTime;
	}

	public void setpDisconnectionTime(Date pDisconnectionTime) {
		this.pDisconnectionTime = pDisconnectionTime;
	}

	@Override
	public String toString() {
		return "AdminDto [pNo=" + pNo + ", pName=" + pName + ", pId=" + pId
				+ ", pPwd=" + pPwd + ", pPhoneNum="	+ pPhoneNum
				+ ", pCom=" + pCom + ", pNickname=" + pNickname
				+ ", pProfile=" + pProfile + ", pEmail=" + pEmail
				+ ", pHireDate=" + pHireDate + ", pKeyword=" + pKeyword
				+ ", pTemporarily=" + pTemporarily
				+ ", pPermission=" + pPermission
				+ ", pCreateDate=" + pCreateDate
				+ ", pModifyDate=" + pModifyDate
				+ ", pConnectionTime=" + pConnectionTime 
				+ ", pDisconnectionTime=" + pDisconnectionTime + "]";
	}

	
	
	
}
