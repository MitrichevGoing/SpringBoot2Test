package com.cjj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cjj.dao")
public class Springboot2testApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2testApplication.class, args);
	}
}
