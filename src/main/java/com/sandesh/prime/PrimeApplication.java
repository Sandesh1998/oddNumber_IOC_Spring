package com.sandesh.prime;

import com.sandesh.prime.odd.OddclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PrimeApplication implements CommandLineRunner {

	OddclassService service;

	@Autowired
	public void setService(OddclassService service){
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(PrimeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		service.printOddNumber(20, 50);
//		System.out.println("Hello world");
	}
}
