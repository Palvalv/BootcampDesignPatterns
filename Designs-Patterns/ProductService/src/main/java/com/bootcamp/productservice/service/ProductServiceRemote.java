package com.bootcamp.productservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.productservice.dto.Precio;
import com.bootcamp.productservice.dto.Producto;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
@ConditionalOnProperty(name = "bootcamp.service.price-service.type", havingValue = "remote")
public class ProductServiceRemote implements ProductServiceI {

	@Value("${bootcamp.service.price-service.endpoint}")
	private String endpoint;

	private final RestTemplate restTemplate = new RestTemplate();

	@Override
	@CircuitBreaker(name = "prices-service", fallbackMethod = "fallBack")
	public Producto get(String id) {
		if (id != null) {
			Producto producto = new Producto();
			final Precio response = this.restTemplate.postForObject(this.endpoint, null, Precio.class, id);
			producto.setProductoId(response.getCodigoProducto());
			producto.setCanal(response.getDescripcion());
			producto.setServerPort(response.getPrecio().toString());
			producto.setServerPort("None");
			return producto;
			} else {
			return null;
		}
	}

	@Override
	@CircuitBreaker(name = "prices-service", fallbackMethod = "fallBack")
	public Producto post(String id) {
		if (id != null) {
			Producto producto = new Producto();
			final Precio response = this.restTemplate.postForObject(this.endpoint, null, Precio.class, id);
			producto.setProductoId(response.getCodigoProducto());
			producto.setCanal(response.getDescripcion());
			producto.setServerPort("None");
			return producto;
		} else {
			return null;
		}
	}

	public Producto fallBack(String id, Throwable a) {
		Producto producto = new Producto();
		producto.setProductoId("None");
		producto.setCanal("None");
		producto.setServerPort("None");
		return producto;
	}
}
