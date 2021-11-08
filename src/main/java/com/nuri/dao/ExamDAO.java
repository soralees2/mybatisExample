package com.nuri.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nuri.vo.ExamVO;

@Repository
public class ExamDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<ExamVO> getAllList(){
		return mybatis.selectList("Example.selectAll");
	}
	
	public int insert(ExamVO vo){
		return mybatis.insert("Example.insert", vo);
	}
	
	public int delete(String id){
		return mybatis.delete("Example.delete", id);
	}
	
	public int update(ExamVO vo){
		return mybatis.update("Example.update", vo);
	}

}
