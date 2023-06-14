package com.boticajoyce.service;

import java.util.List;

import com.boticajoyce.entity.ProductoEntity;

public interface IProductoService {
	List<ProductoEntity> getProductos();
	ProductoEntity getProductoById(int id);
	ProductoEntity mantener(ProductoEntity bean);
}
