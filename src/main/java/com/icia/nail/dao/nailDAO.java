package com.icia.nail.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.nail.dto.nailDTO;

@Repository
public class nailDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int memberJoin(nailDTO nail) {
		return sql.insert("nm.memberjoin", nail);
	}

	public String memberLogin(nailDTO nail) {
		return sql.selectOne("nm.memberlogin",nail);
	}

}
