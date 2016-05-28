package jp.neosoft.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class NeoSoftSpringApplication {
	public static Logger logger = LoggerFactory.getLogger(NeoSoftSpringApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(NeoSoftSpringApplication.class, args);
	}
}
