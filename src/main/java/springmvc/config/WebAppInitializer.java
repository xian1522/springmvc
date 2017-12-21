package springmvc.config;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends
		AbstractAnnotationConfigDispatcherServletInitializer {
	
	/**
	 * ָ��spring.ioc������
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}
	
	/**
	 * ָ��spring.mvc������
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String []{"/"};
	}
	
	/**
	 * �ϴ���������
	 */
	@Override
	protected void customizeRegistration(Dynamic registration){
		registration.setMultipartConfig(new MultipartConfigElement("/temp/uploads"));
	}
	
	/**
	 * ���ù�����
	 */
	protected Filter[] getServletFilters(){
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("utf-8");
		encodingFilter.setForceEncoding(true);
		return new Filter[] {
			encodingFilter,
			new HiddenHttpMethodFilter()
		};
	}
}
