package com.bootcamp.productservice.service;

import com.bootcamp.productservice.dto.Producto;

public interface ProductServiceI {

	public Producto get(String id);
	public Producto post(String id);
}
