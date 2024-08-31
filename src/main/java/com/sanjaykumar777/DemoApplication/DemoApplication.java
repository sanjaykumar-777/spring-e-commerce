package com.sanjaykumar777.DemoApplication;

import com.sanjaykumar777.DemoApplication.practice.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Dev dev = context.getBean(Dev.class);
		dev.build();
	}

}
