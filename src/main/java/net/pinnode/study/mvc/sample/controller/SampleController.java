package net.pinnode.study.mvc.sample.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.pinnode.study.mvc.sample.service.ArticleService;

@Controller
public class SampleController {
	
	private Log log = LogFactory.getLog(SampleController.class);
	
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/sample")
	public String sample(HttpServletRequest requset,
							HttpServletResponse response,
							Model model) throws Exception {
		
		log.info("로그는 이렇게 찍습니다.......");
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		model.addAttribute("currentTime", currentTime.toString());
		model.addAttribute("totalCount", articleService.getTotalCount());
		
		return "sample";
	}
}
