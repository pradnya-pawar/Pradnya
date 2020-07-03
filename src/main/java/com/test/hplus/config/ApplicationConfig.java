package com.test.hplus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan
public class ApplicationConfig extends WebMvcConfigurationSupport {
	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		//This method help us to tell the spring that whenever you required any static files css/images you have to pick it up from specified path mentioned in this method.
		
		  registry.addResourceHandler("css/**","images/**")
		  .addResourceLocations("classpath:/static/css/","classpath:/static/images");
		  
		 
		
		super.addResourceHandlers(registry);
	}
	@Bean
	public InternalResourceViewResolver jspViewResolver()
	{
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);//so that it will render proper jsp pages
		return viewResolver;
	}
}
