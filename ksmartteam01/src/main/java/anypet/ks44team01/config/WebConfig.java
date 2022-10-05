package anypet.ks44team01.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import anypet.ks44team01.interceptor.CommonInterceptor;
import anypet.ks44team01.interceptor.LoginInterceptor;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	private final CommonInterceptor commonInterceptor;
	private final LoginInterceptor loginInterceptor;
	
	public WebConfig(LoginInterceptor loginInterceptor, CommonInterceptor commonInterceptor) {
		// TODO Auto-generated constructor stub
		this.commonInterceptor = commonInterceptor;
		this.loginInterceptor = loginInterceptor;
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(commonInterceptor)
		.addPathPatterns("/**")
		.excludePathPatterns("/")
		.excludePathPatterns("/css/**")				
		.excludePathPatterns("/favicon.io");
		
		registry.addInterceptor(loginInterceptor)
				.addPathPatterns("/**")
				.excludePathPatterns("/")
				.excludePathPatterns("/css/**");		
	
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
