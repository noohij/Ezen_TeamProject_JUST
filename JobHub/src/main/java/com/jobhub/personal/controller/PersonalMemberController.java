package com.jobhub.personal.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.jobhub.personal.controller.PersonalMemberController;
import com.jobhub.personal.dto.PersonalMemberDto;
import com.jobhub.personal.service.PersonalMemberService;

@Controller
public class PersonalMemberController {

	private static final Logger log 
		= LoggerFactory.getLogger(PersonalMemberController.class);

	@Autowired
	private PersonalMemberService PersonalMemberService;

	// 로그인 화면 이동
	@RequestMapping(value = "/personal/login.do", method = RequestMethod.GET)
	public String login(HttpSession session, Model model) {

		log.info("Welcome PersonalMemberController login!");

		return "personal/auth/PersonalLoginForm";
	}

	// 로그인 클릭 시 이동
	@RequestMapping(value = "/personal/loginCtr.do", method = RequestMethod.POST)
	public String loginCtr(String pId, String pPwd, HttpSession session, Model model) {

		log.info("Welcome PersonalMemberController loginCtr! " + pId + ", " + pPwd);

		PersonalMemberDto personalmemberDto 
			= PersonalMemberService.personalMemberExist(pId, pPwd);

		String viewUrl = "";
		if (personalmemberDto != null) {
//			회원이 존재하면 세션에 담는다
			session.setAttribute("personalmemberDto", personalmemberDto);
			viewUrl = "personal/myPage/PersonalMyPage";
		} else {
			viewUrl = "personal/auth/LoginFail";
		}

		return viewUrl;
	}

	// 로그아웃
	@RequestMapping(value = "/personal/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session, Model model) {

		log.info("Welcome MemberController logout!");

		session.invalidate(); // 세션 종료

		return "/common/LogoutForm";
	}


	// 회원가입
//	일반.do는 단순 페이지 이동
	@RequestMapping(value = "/personal/add.do", method = RequestMethod.GET)
	public String MemberAdd(Model model) {

		log.debug("Welcome PersonalMemberController personalMemberAdd!");

		return "/personal/auth/JoinPersonal";
	}

	@RequestMapping(value = "/personal/addCtr.do", method = RequestMethod.POST)
	public String memberAddCtr(PersonalMemberDto personalMemberDto, Model model) {
		log.debug("Welcome PersonalMemberController memberAddCtr!" + personalMemberDto);

		try {
			PersonalMemberService.personalInsertOne(personalMemberDto);
		} catch (Exception e) {
			System.out.println("오류 처리할거 있음 한다");
			e.printStackTrace();
		}
		return "redirect:/personal/login.do";
	}
	
	@RequestMapping(value = "/personal/nickNameUpdate.do", method = RequestMethod.GET)
	public String nickNameUpdate(HttpSession session, Model model) {
		log.info("Welecom PersonalMemberNickNameUpdate!");
		
		return "personal/myPage/PersonalMyPageNickNameUpdate";
	}
	
	@RequestMapping(value = "/personal/passwordUpdate.do", method = RequestMethod.GET)
	public String passwordUpdate(HttpSession session, Model model) {
		log.info("Welecom PersonalMemberPasswordUpdate!");
		
		return "personal/myPage/PersonalMyPagePasswordUpdate";
	}
	
	@RequestMapping(value = "/personal/phoneNumUpdate.do", method = RequestMethod.GET)
	public String phoneNumUpdate(HttpSession session, Model model) {
		log.info("Welecom PersonalMemberPhoneNumUpdate!");
		
		return "personal/myPage/PersonalMyPagePhoneNumUpdate";
	}
	
	@RequestMapping(value = "/personal/emailUpdate.do", method = RequestMethod.GET)
	public String emailUpdate(HttpSession session, Model model) {
		log.info("Welecom PersonalMemberEmailUpdate!");
		
		return "personal/myPage/PersonalMyPageEmailUpdate";
	}
	
	@RequestMapping(value = "/personal/keywordUpdate.do", method = RequestMethod.GET)
	public String keywordUpdate(HttpSession session, Model model) {
		log.info("Welecom PersonalMemberKeywordUpdate!");
		
		return "personal/myPage/PersonalMyPageKeywordUpdate";
	}
	
	
	@RequestMapping(value = "/personal/nickNameUpdateCtr.do", method = RequestMethod.POST)
	public String nickNameUpdateCtr(String pNickname, int pNo 
			, PersonalMemberDto personalMemberDto, Model model) {
		log.info("Welecome PersonalMembernickNameUpdateCtr");
		
		personalMemberDto.setpNickname(pNickname);
		personalMemberDto.setpNo(pNo);
		
		try {
			PersonalMemberService.personalMemberNickNameUpdateOne(personalMemberDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "personal/myPage/PersonalMyPage";
	}
	
	@RequestMapping(value = "/personal/passwordUpdateCtr.do", method = RequestMethod.POST)
	public String passwordUpdateCtr(String pPwd, int pNo 
			, PersonalMemberDto personalMemberDto, Model model) {
		log.info("Welecome PersonalMemberPasswordUpdateCtr");
		
		personalMemberDto.setpNickname(pPwd);
		personalMemberDto.setpNo(pNo);
		
		try {
			PersonalMemberService.personalMemberPasswordUpdateOne(personalMemberDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "personal/myPage/PersonalMyPage";
	}
	
	@RequestMapping(value = "/personal/phoneNumUpdateCtr.do", method = RequestMethod.POST)
	public String phoneNumUpdateCtr(String pPhoneNum, int pNo 
			, PersonalMemberDto personalMemberDto, Model model) {
		log.info("Welecome PersonalMemberPhoneNumUpdateCtr");
		
		personalMemberDto.setpNickname(pPhoneNum);
		personalMemberDto.setpNo(pNo);
		
		try {
			PersonalMemberService.personalMemberPhoneNumUpdateOne(personalMemberDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "personal/myPage/PersonalMyPage";
	}
	
	@RequestMapping(value = "/personal/emailUpdateCtr.do", method = RequestMethod.POST)
	public String emailUpdateCtr(String pEmail, int pNo 
			, PersonalMemberDto personalMemberDto, Model model) {
		log.info("Welecome PersonalMemberEmailUpdateCtr");
		
		personalMemberDto.setpNickname(pEmail);
		personalMemberDto.setpNo(pNo);
		
		try {
			PersonalMemberService.personalMemberEmailUpdateOne(personalMemberDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "personal/myPage/PersonalMyPage";
	}
	
	@RequestMapping(value = "/personal/keywordUpdateCtr.do", method = RequestMethod.POST)
	public String keywordUpdateCtr(String pKeyword, int pNo 
			, PersonalMemberDto personalMemberDto, Model model) {
		log.info("Welecome PersonalMemberKeywordUpdateCtr");
		
		personalMemberDto.setpNickname(pKeyword);
		personalMemberDto.setpNo(pNo);
		
		try {
			PersonalMemberService.personalMemberKeywordUpdateOne(personalMemberDto);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "personal/myPage/PersonalMyPage";
	}


}// end PersonalMemberController
