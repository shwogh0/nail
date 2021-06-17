package com.icia.nail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.nail.dto.nailDTO;
import com.icia.nail.service.nailService;

@Controller
public class nailController {
	@Autowired
	private nailService ns;
	
	private ModelAndView mav;
	
	
	@RequestMapping(value="/joinpage")
	public String joinPage() {
		return "memberjoin";
	}
	
	@RequestMapping(value="/memberjoin")
	public ModelAndView memberJoin(@ModelAttribute nailDTO nail) {
		mav=ns.memberJoin(nail);
		return mav;
	}
	
	@RequestMapping(value="/loginpage")
	public String loginPage() {
		return "memberlogin";
	}
	
	@RequestMapping(value="/login")
	public ModelAndView memberLogin(@ModelAttribute nailDTO nail) {
		mav=ns.memberLogin(nail);
		return mav;
	}
}
