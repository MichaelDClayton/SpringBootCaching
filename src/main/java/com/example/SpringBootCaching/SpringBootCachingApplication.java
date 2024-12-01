package com.example.SpringBootCaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import javax.management.*;

@SpringBootApplication
@EnableCaching
public class SpringBootCachingApplication {

	public static void main(String[] args)  {
		SpringApplication.run(SpringBootCachingApplication.class, args);
	}

}
