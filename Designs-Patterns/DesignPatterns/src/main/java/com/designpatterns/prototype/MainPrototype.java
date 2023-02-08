package com.designpatterns.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class MainPrototype {
	
	@Autowired
	private static ApplicationContext context;

		public static void main(String[] args) {
			SpringApplication.run(MainPrototype.class, args);
			// Person Pablo= (Person)context.getBean("personPrototype");
			// Pablo.getName();
		}
		
}