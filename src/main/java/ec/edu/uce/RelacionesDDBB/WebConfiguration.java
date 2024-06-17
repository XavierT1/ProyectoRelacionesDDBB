package ec.edu.uce.RelacionesDDBB;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;


@Configuration
public class WebConfiguration {

    @Bean
    public ServletRegistrationBean<?> h2servletRegistration() {
        ServletRegistrationBean<?> registrationBean = new ServletRegistrationBean<>(new WebServlet());
        registrationBean.addUrlMappings("/h2-console/*");
        return registrationBean;
    }
}
