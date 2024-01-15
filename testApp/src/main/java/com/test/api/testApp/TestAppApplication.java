package com.test.api.testApp;

import com.test.api.testApp.config.BaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(BaseConfig.class)
public class TestAppApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(TestAppApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}

}
