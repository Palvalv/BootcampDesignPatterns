package com.bootcamp.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.productservice.dto.Producto;
import com.bootcamp.productservice.service.ProductServiceI;

import io.github.resilience4j.retry.annotation.Retry;

@RestController("API")
public class ProductController {

	private ProductServiceI productService;
	
	public ProductController(ProductServiceI productService) {
		this.productService = productService;
	}

	@GetMapping("/producto/{id}")
	@Retry(name = "price-service", fallbackMethod = "fallBack")
	public Producto getProducto(@PathVariable String id) {
		return productService.get(id);
	}
	
	@Retry(name = "price-service", fallbackMethod = "fallBack")
	@PostMapping("/post")
	public Producto postProducto(@PathVariable(value = "id") String id) {
		return productService.post(id);
	}

	public Producto fallBack(String id, Throwable a) {
		Producto producto = new Producto();
		producto.setProductoId("None");
		producto.setCanal("None");
		producto.setServerPort("None");
		return producto;
		}

}
