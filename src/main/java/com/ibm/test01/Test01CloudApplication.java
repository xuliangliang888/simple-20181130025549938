package com.ibm.test01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Test01CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test01CloudApplication.class, args);
	}
}
