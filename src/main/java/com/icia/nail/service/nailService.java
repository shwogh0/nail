package com.icia.nail.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.nail.dao.nailDAO;
import com.icia.nail.dto.nailDTO;

@Service
public class nailService {

	@Autowired
	private nailDAO ndao;
	
	@Autowired
	private HttpSession session;
	
	private ModelAndView mav;
	
	public ModelAndView memberJoin(nailDTO nail) {
		mav=new ModelAndView();
		
	int	insertResult = 0;
	
	insertResult = ndao.memberJoin(nail);
	if(insertResult > 0) {
		mav.setViewName("memberlogin");
	}
		return mav;
	}

	public ModelAndView memberLogin(nailDTO nail) {
		mav=new ModelAndView();
		
		String loginId = ndao.memberLogin(nail);
		if(loginId != null) {
			session.setAttribute("loginMember", loginId);
			mav.setViewName("reservation");
		}
		return mav;
	}

}
