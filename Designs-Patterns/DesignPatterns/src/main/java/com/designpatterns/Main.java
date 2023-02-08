package com.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.designpatterns.decorator.Decorator;
import com.designpatterns.decorator.Person;
import com.designpatterns.decorator.PersonI;


@SpringBootApplication
public class Main 
{
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
    	
    	PersonI personI= new Person();
    	personI.setName("Interface");
    	
    	PersonI personI2= new Decorator(personI);
    	
    	System.out.println(personI2.getName());
	}
}
    
    	
    	
    	
    	
    	
    	
    	
    	
    	
    

