package net.pinnode.study.config.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomExceptionHandler implements ErrorController {
	
	private final String PATH = "error";
	
	@RequestMapping("/error")
	@ExceptionHandler(Exception.class)
	public String error(HttpServletRequest request,
						HttpServletResponse response,
						Exception exception,
						Model model) throws Exception {
		
		model.addAttribute("exception", exception);
		model.addAttribute("status", response.getStatus());
		model.addAttribute("requestUrl", request.getRequestURL());
		
		return PATH;
	}

	@Override
	public String getErrorPath() {
		return PATH;
	}
}
