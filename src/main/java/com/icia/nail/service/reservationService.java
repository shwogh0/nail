package com.icia.nail.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.nail.dao.reservationDAO;
import com.icia.nail.dto.reservationDTO;

@Service
public class reservationService {
	
	@Autowired
	private reservationDAO rdao;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	public ModelAndView reservationDate(reservationDTO reservation) {
		mav = new ModelAndView();
		
		int reservationResult = rdao.reservationDate(reservation);
		
		if(reservationResult > 0) {
		mav.setViewName("redirect:/reservationlist");
		}
		return mav;
	}

	public ModelAndView reservationList() {
		mav = new ModelAndView();
		List<reservationDTO> reservationList = rdao.reservationList();
		
		mav.addObject("reservationList",reservationList);
		mav.setViewName("reservationlist");
		
		return mav;
	}

}
