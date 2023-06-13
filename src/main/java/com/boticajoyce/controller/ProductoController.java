package com.boticajoyce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.boticajoyce.service.IProductoService;

@Controller
public class ProductoController {

	@Autowired
	IProductoService prodserv;
	
	@GetMapping("/producto")
	public String listadoProd() {
		return "Producto";
	}
	
	@GetMapping("/producto/registrar")
	public String registrarProd() {
		return "MantenimientoProd";
	}
}
