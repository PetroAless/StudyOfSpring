package com.example.myTaskScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MyTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyTaskSchedulerApplication.class, args);
	}

}
