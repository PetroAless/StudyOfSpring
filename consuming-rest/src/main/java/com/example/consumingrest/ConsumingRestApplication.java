package com.example.consumingrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingRestApplication {
	private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
		return args -> {
			Profiles profiles = restTemplate.getForObject("https://gorest.co.in/public/v2/users?profile=p1,p2,p3,p4" +
					",p5,p6,p7,p8,p9,p10",Profiles.class);
			log.info(profiles.toString());
		};
	}
}
