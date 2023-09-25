package com.jobhub.admin.controller;



import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobhub.admin.dto.AdminDto;
import com.jobhub.admin.service.AdminService;
import com.jobhub.company.dto.CompanyMemberDto;
import com.jobhub.personal.dto.PersonalMemberDto;

@Controller
public class AdminController {

	private static final Logger log 
		= LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService adminService;
	
	// 로그인 화면으로 이동
	@RequestMapping(value = "/admin/login.do", method = RequestMethod.GET)
	public String login(HttpSession session, Model model) {
		log.info("Welcome AdminController login!");
		
		return "admin/auth/AdminLoginForm";
	}
	
	// 로그인 버튼 클릭 시
		@RequestMapping(value = "/admin/loginCtr.do", method = RequestMethod.POST)
		public String loginCtr(String id, String pwd
				, HttpSession session, Model model) {
			log.info("Welcome AdminController loginCtr!" + id + ", " + pwd);
			
			AdminDto adminDto = adminService.adminExist(id, pwd);
			String viewUrl = "";
			
			if(adminDto != null) {
//				회원이 존재하면 세션에 담는다
				session.setAttribute("member", adminDto);
				
				viewUrl = "redirect:/admin/memberList.do";
			} else {
				viewUrl = "redirect:/Home";
			}
			
			return viewUrl;
		}
		
		
		@RequestMapping(value = "/admin/memberList.do"
				, method = {RequestMethod.GET, RequestMethod.POST})
		public String memberList(Model model) {
			// log4j
			log.info("Welcome MemberController list!: {}");
			
//			int totalCount = adminService.memberSelectTotalCount();
//			List<PersonalMemberDto> personalMemberList 
//								= personalMemberList.personalMemberSelectList(); 
//			List<CompanyMemberDto> companyMemList 
//								= companyMemList.companyMemSelectList();
		    List<PersonalMemberDto> personalList = adminService.memberSelectList();

		    model.addAttribute("personalList", personalList);

		    return "admin/MemberList";
		}
		
		@RequestMapping(value = "/admin/companyMemList.do"
				, method = {RequestMethod.GET, RequestMethod.POST})
		public String companyMemberList(Model model) {
			
			log.info("Welcome CompanyMemController");
			
			List<CompanyMemberDto> companyMemList 
									= adminService.companyMemSelectList();
			
			model.addAttribute("companyMemList", companyMemList);
			System.out.println(companyMemList);
			
			return "admin/CompanyMemList";
		}
		
		@RequestMapping(value = "/admin/personalMemberList.do"
				, method = {RequestMethod.GET, RequestMethod.POST})
		public String personalmemberList(Model model) {
			// log4j
			log.info("Welcome PersonalMemberController list!: {}");
			
//			int totalCount = adminService.memberSelectTotalCount();
		      
		    List<PersonalMemberDto> personalList 
		    							= adminService.personalMemberSelectList();

		    model.addAttribute("personalList", personalList);
		    System.out.println(personalList);

		    return "admin/PersonalMemberList";
		}
		
		@RequestMapping(value = "/admin/delete.do", method = RequestMethod.GET)
		public String memberDelete(AdminDto adminDto, Model model) {
			
			log.info("Welcome MemberController delete");
			
			adminService.adminDeleteOne(adminDto);
			
			System.out.println(adminDto);
			
			return "admin/MemberList";
		}
		
		@RequestMapping(value = "/admin/personaldelete.do", method = RequestMethod.GET)
		public String personalDelete(AdminDto adminDto, Model model) {
			
			log.info("Welcome MemberController personaldelete");
			
			adminService.personalDeleteOne(adminDto);
			
			System.out.println(adminDto);
			
			return "admin/PersonalMemberList";
		}
		
		@RequestMapping(value = "/admin/companydelete.do", method = RequestMethod.GET)
		public String companydelete(AdminDto adminDto, Model model) {
			
			log.info("Welcome MemberController companydelete");
			
			adminService.companyDeleteOne(adminDto);
			
			System.out.println(adminDto);
			
			return "admin/CompanyMemList";
		}
}
