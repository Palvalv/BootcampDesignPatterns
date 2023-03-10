package com.designpatterns.jerarquia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainMain {

	public static void main(String[] args) {
		SpringApplication.run(ChainMain.class, args);
		
		Unidad capitan=new Unidad("Capitán");
		Unidad comandante= new Unidad("Comandante");
		capitan.estableceMando(comandante);
		Unidad soldado= new Unidad("Soldado");
		comandante.estableceMando(soldado);
		
		UnidadDeMando unidadDeMando= new UnidadDeMando();
		unidadDeMando.anadirEjercito(capitan);
		unidadDeMando.anadirEjercito(comandante);
		unidadDeMando.anadirEjercito(soldado);
		
		unidadDeMando.ejecutaOrder("Al ataque");
	}
}
