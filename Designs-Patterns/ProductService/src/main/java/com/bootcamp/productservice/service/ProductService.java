package com.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import com.bootcamp.productservice.dto.Producto;

@Service
@ConditionalOnProperty(name = "bootcamp.service.price-service.type", havingValue = "in-memory")
public class ProductService implements ProductServiceI {
	
	@Value("${server.port}")
	private String serverPort;

	public Producto get(String id) {
		Producto producto = new Producto();
		producto.setProductoId(id);
		producto.setCanal("GET"); 
		producto.setServerPort(serverPort);
		return producto;
	}

	public Producto post(String id) {
		Producto producto = new Producto();
		producto.setProductoId(id);
		producto.setCanal("POST");
		producto.setServerPort(serverPort);
		return producto;
	}

}
