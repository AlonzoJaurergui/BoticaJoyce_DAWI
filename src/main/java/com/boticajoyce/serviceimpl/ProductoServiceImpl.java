package com.boticajoyce.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boticajoyce.entity.ProductoEntity;
import com.boticajoyce.repository.IProductoRepository;
import com.boticajoyce.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoRepository reprod;
	
	@Override
	public ProductoEntity mantener(ProductoEntity bean) {
		return reprod.save(bean);
	}

	@Override
	public List<ProductoEntity> getProductos() {
		return reprod.findAll();
	}

	@Override
	public ProductoEntity getProductoById(int id) {
		return reprod.findById(id).orElse(null);
	}

	@Override
	public void eliminar(ProductoEntity bean) {
		reprod.delete(bean);
	}

	
}
