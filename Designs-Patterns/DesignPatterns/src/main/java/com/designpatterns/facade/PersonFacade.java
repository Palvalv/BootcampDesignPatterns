package com.designpatterns.facade;

public class PersonFacade {

	private Person person;
	
	public PersonFacade(int age) {
		person= new Person();
		person.setAge(age);
	}
	
	public boolean requisitoEdad() {
	boolean flag=false;
	if(person.getAge()>18 && person.getAge()<40) {
		flag=true;
	}
	return flag;
				
	}
}
