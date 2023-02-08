package com.bootcamp.productservice.dto;

public class Producto {
	private String productoId;
	private String canal;
	private String serverPort;

	public String getProductoId() {
		return productoId;
	}
	
	public void setProductoId(String productoId) {
		this.productoId = productoId;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

}
