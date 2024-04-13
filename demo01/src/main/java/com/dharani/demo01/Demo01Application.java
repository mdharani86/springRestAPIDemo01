package com.dharani.demo01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

import com.dharani.demo01.pojo.Droid;

@SpringBootApplication
@ConfigurationPropertiesScan
public class Demo01Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo01Application.class, args);
	}

	@Bean
	@ConfigurationProperties(prefix = "droid") 
	public Droid createDroid() {
		return new Droid();
	}

}
