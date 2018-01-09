package com.autogas.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@SpringBootApplication
@ComponentScan(useDefaultFilters = true)
public class SpringbootApplication extends WebMvcConfigurerAdapter{

	 public static void main(String[] args) {
		 SpringApplication.run(SpringbootApplication.class, args);
     }
	 /** 
	     * 修改tomcat默认配置 
	     * @return 
	     */  
	    @Bean  
	    public TomcatEmbeddedServletContainerFactory servletContainer(){  
	        TomcatEmbeddedServletContainerFactory container = new TomcatEmbeddedServletContainerFactory();  
	        container.setPort(8088);  
        // container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,""));  
	        return container;  
	    }  
}
