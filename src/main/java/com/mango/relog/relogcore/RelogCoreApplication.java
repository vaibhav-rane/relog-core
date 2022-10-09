package com.mango.relog.relogcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RelogCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelogCoreApplication.class, args);
	}

}
