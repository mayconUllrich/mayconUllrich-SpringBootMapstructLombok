package com.retimotor.fluxo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.retimotor.fluxo")
public class FluxoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FluxoApplication.class, args);
	}
}