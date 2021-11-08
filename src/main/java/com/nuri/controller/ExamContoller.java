package com.nuri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nuri.service.ExamService;
import com.nuri.vo.ExamVO;

@Controller
@RequestMapping("/exam")
public class ExamContoller {
	
	@Autowired ExamService svc;
	
	@RequestMapping("/dataList")
	public String dataList(Model m) {
		List<ExamVO> list = svc.getAllList();
		m.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("input")
	public String input(ExamVO vo) throws Exception{
		svc.insert(vo);
		return "redirect:dataList";
	}
	
	@RequestMapping("delete")
	public String delete(String title) throws Exception{
		svc.delete(title);
		return "redirect:dataList";
	}
	
	@RequestMapping("update")
	public String update(ExamVO vo) throws Exception{
		svc.update(vo);
		return "redirect:dataList";
	}
	
	
	
	
	
	
}
