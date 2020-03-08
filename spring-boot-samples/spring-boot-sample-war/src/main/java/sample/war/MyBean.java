package sample.war;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author wangxi
 * @Time 2020/3/8 17:24
 */
@Configuration
public class MyBean {

	@Bean
	ServletWebServerFactory servletWebServerFactory(){
		return new TomcatServletWebServerFactory();
	}
}
