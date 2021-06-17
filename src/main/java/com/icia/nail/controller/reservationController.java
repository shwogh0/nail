package com.icia.nail.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icia.nail.dto.reservationDTO;
import com.icia.nail.service.reservationService;

@Controller
public class reservationController {

	@Autowired
	private reservationService rs;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	
	@RequestMapping(value="/reservationpage")
	public String reservationPage() {
		return "reservation";
	}
	
	@RequestMapping(value="/reservationdate")
	public ModelAndView reservationDate(@ModelAttribute reservationDTO reservation) {
		mav=rs.reservationDate(reservation);
		return mav;
	}
	
	@RequestMapping(value="/reservationlist")
	public ModelAndView reservationList() {
		mav=rs.reservationList();
		
		return mav;
	}
}
