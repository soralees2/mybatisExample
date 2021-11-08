package com.nuri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nuri.dao.ExamDAO;
import com.nuri.vo.ExamVO;

@Service
public class ExamService {

	@Autowired
	private ExamDAO dao;
	
	public List<ExamVO> getAllList() {
		return dao.getAllList();
	}
	
	public int delete(String title) {
		return dao.delete(title);
	}
	
	public int update(ExamVO vo) {
		return dao.update(vo);
	}
	
	public int insert(ExamVO vo) {
		return dao.insert(vo);
	}

}
