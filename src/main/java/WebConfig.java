import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        // 不需要額外配置，Spring Boot 預設會處理 /static/**
	    }
}