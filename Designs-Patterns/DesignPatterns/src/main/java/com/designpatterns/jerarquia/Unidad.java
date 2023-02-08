package com.designpatterns.jerarquia;

public class Unidad {

	protected Unidad mando;
	protected String nombre;
	
	public Unidad(String nombre) {
		this.nombre=nombre;
	}
	
	public void estableceMando(Unidad mando) {
		this.mando=mando;
	}
	
	public void ejecutarOrder(String orden) {
		if(mando!= null) {
			System.out.println("Al ataque "+ mando.nombre);
			mando.ejecutarOrder(orden);
		}else {
			System.out.println(orden);
			
		}
	}
}
