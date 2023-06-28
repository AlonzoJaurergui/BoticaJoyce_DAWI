package com.boticajoyce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boticajoyce.entity.ClienteEntity;
import com.boticajoyce.service.IClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	IClienteService servcli;
	
	@GetMapping("/cliente")
	public String cargaCliente(Model model) {
		List<ClienteEntity> clientes = servcli.getClientesList();
		
		model.addAttribute("clientes", clientes);
		return "Cliente";
	}

}
