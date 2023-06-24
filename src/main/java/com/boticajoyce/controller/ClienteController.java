package com.boticajoyce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {
	
	@GetMapping("/cliente")
	public String cargaCliente(Model model) {
		return "Cliente";
	}

}
