package com.boticajoyce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boticajoyce.repository.IEmpleadoRepository;
import com.boticajoyce.repository.IUsuarioRepository;



@Controller
public class UsuariosController {

	@Autowired
	private IEmpleadoRepository repem;
	@Autowired
	private IUsuarioRepository repusu;
	
	@GetMapping("/carga")
	public String cargaLogin(Model model) {
		return "Producto";
	}
	
}
