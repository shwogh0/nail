package com.icia.nail.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.nail.dto.reservationDTO;

@Repository
public class reservationDAO {

	@Autowired
	private SqlSessionTemplate sql;

	public int reservationDate(reservationDTO reservation) {
		return sql.insert("rm.reservationdate", reservation);
	}

	public List<reservationDTO> reservationList() {
		return sql.selectList("rm.reservationlist");
	}
	
	
}
