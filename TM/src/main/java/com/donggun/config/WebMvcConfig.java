package com.donggun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.donggun.interceptor.CheckAuthInterceptor;

/**
 * @author donggun
 * @since Apr 12, 2021
 */

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	private final CheckAuthInterceptor interceptor;
	
	@Autowired
	public WebMvcConfig(CheckAuthInterceptor interceptor) {
		this.interceptor = interceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor)
					.addPathPatterns("/**")
					.excludePathPatterns("/user/**");
	}

	
}
