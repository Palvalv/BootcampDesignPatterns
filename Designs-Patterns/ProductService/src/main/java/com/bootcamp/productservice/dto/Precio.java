package com.bootcamp.productservice.dto;

import java.math.BigDecimal;

public class Precio {

	private int id;

	private String codigoProducto;

	private String descripcion;

	private BigDecimal precio;

	public Precio() {
		super();
		this.id = -1;
		this.codigoProducto = "NONE";
		this.descripcion = "NONE";
		this.precio = new BigDecimal(0.0);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

}