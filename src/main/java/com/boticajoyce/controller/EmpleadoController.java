package com.boticajoyce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.boticajoyce.entity.EmpleadoEntity;
import com.boticajoyce.repository.ICargoRepository;
import com.boticajoyce.repository.IEmpleadoRepository;

@Controller
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoRepository repem;
	
	@Autowired
	private ICargoRepository repcar;
	
	@GetMapping("/listaemple")
	public String listadoEmpleado(Model model) {
		model.addAttribute("lstEmpleados", repem.findAll());
		model.addAttribute("empleado", new EmpleadoEntity());
		return "listado-Empleado";
	}
	
	@GetMapping("/guardaemple")
	public String guardarEmple(@ModelAttribute EmpleadoEntity empleado) {
		repem.save(empleado);
		
		return "redirect:/listaemple";
	}
	
	@GetMapping("/editaemple/{idempleado}")
	public String buscarEmple(@PathVariable("idempleado")Integer idempleado, Model model) {
		EmpleadoEntity empleado= repem.findById(idempleado).get();
		model.addAttribute("empleado",empleado);
		
		model.addAttribute("listaCargo", repcar.findAll());
		//model.addAttribute("listaUsuario", repogene.findAll());
		
		return "actualiza-Empleado";
	}
}
