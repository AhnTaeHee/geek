package net.pinnode.study.config.interceptor;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class LoggingInterceptor extends HandlerInterceptorAdapter {
	
	private Log log = LogFactory.getLog(LoggingInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, 
								HttpServletResponse response, 
								Object handler) throws Exception {
		
		String requestUri = request.getRequestURI();
		
		if (requestUri.length() > 0) {
			
			log.info("==================================================================================");
			log.info("Request URI :: " + requestUri);
			
			Enumeration<String> parameterNames = request.getParameterNames();
			
			while (parameterNames.hasMoreElements()) {
				String name = parameterNames.nextElement();
				String [] values = request.getParameterValues(name);
				
				for (String value : values) {
					log.info("  Parameter :: ["+ name +"] : " + value);
				}
			}
		}
		
		log.info("");
		
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, 
							HttpServletResponse response, 
							Object handler,
							ModelAndView modelAndView) throws Exception {

		log.info("");
		log.info("==================================================================================");
		
		super.postHandle(request, response, handler, modelAndView);
	}
}
