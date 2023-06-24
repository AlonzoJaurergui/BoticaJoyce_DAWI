package com.boticajoyce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.boticajoyce.service.IUsuarioService;

@Controller
public class UsuariosController {

	//@Autowired
	//private IEmpleadoRepository repem;
	@Autowired
	private IUsuarioService repusu;
	
	@GetMapping("/")
	public String cargaLogin(Model model) {
		return "index";
	}
	
	@GetMapping("/registro")
	public String registroUsu() {
		return "RegistroUsu";
	}
	
	@GetMapping("/menu")
	public String funLogin() {
		
		return "menu";
	}
	
}
