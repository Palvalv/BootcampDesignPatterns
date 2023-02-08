package com.designpatterns.facade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FacadeMain {
	public static void main(String[] args) {
		SpringApplication.run(FacadeMain.class, args);
		PersonFacade personFacade1=new PersonFacade(27);
		System.out.println(personFacade1.requisitoEdad());
	}
}
