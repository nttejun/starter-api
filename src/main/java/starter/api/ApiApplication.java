package starter.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

@SpringBootApplication
@Configuration
public class ApiApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	private static final Logger logger = LoggerFactory.getLogger(ApiApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiApplication.class);
	}

	// 메소드를 호출하면 비동기 모드가 on 상태
	@Override
	public void onStartup(ServletContext ctx){

		DispatcherServlet servlet = new DispatcherServlet();
		ServletRegistration.Dynamic registration = ctx.addServlet("dispatcher", servlet);
		registration.setAsyncSupported(true);

	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
