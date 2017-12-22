package net.pinnode.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class StudyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		
		SpringApplication.run(StudyApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		
		/*
		 * 외부 Tomcat으로 구동
		 */
		
		return builder.sources(StudyApplication.class);
	}
}
