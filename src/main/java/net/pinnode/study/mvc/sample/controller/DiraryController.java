package net.pinnode.study.mvc.sample.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.awt.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.pinnode.study.mvc.sample.dao.DiaryDao;
import net.pinnode.study.mvc.sample.dto.Diary;
import net.pinnode.study.mvc.sample.service.DiaryService;

@Controller
public class DiraryController {
	
	private Log log = LogFactory.getLog(DiraryController.class);

	@Autowired
	private DiaryService diaryService;
	
	//글작성
	@RequestMapping("/write")
	public String write() {
		return "write";
	}
	
	//글작성 처리
	@RequestMapping("/writeProc")
	public String writeProc(HttpServletRequest request) throws Exception {
		
		Diary diary = new Diary();
		
		diary.setDiary_date(request.getParameter("diary_date"));
		diary.setContent(request.getParameter("content"));
		
		diaryService.write(diary);
		
		return "/list";
	}
	
	//리스트
	@RequestMapping("/list")
	public String list(Model model)throws Exception{
		
		model.addAttribute("list",diaryService.list());
		
		return "/list";
	}
	
	//상세
	@RequestMapping("/read?={num}")
	public String read(int num, Model model)throws Exception{
		
		model.addAttribute("read",diaryService.read(num));
		
		return "/read";
	}
	
	//수정
	@RequestMapping("/update")
	public String update(int num, Model model)throws Exception{
		
		model.addAttribute("read",diaryService.read(num));
		
		return "update";
	}
		
	//수정처리
	@RequestMapping("/updateProc")
	public String updateProc(HttpServletRequest request) throws Exception{
		
		Diary diary = (Diary)request.getParameterMap();
		
		diaryService.update(diary);
		
		return "update";
	}
			
	
	
	
	

}
