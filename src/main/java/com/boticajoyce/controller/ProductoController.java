package com.boticajoyce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.boticajoyce.entity.CategoriaEntity;
import com.boticajoyce.entity.IfaEntity;
import com.boticajoyce.entity.LaboratorioEntity;
import com.boticajoyce.entity.ProductoEntity;
import com.boticajoyce.service.ICategoriaService;
import com.boticajoyce.service.IIfaService;
import com.boticajoyce.service.ILaboratorioService;
import com.boticajoyce.service.IProductoService;

@Controller
public class ProductoController {

	@Autowired
	IProductoService prodserv;
	@Autowired
	ICategoriaService catserv;
	@Autowired
	ILaboratorioService labserv;
	@Autowired
	IIfaService ifaserv;
	
	@GetMapping("/producto")
	public String listadoProd(Model model) {
		List<CategoriaEntity> categorias = catserv.getCategorias();
		List<LaboratorioEntity> laboratorios = labserv.getLaboratorios();
		List<IfaEntity> ifas = ifaserv.getIfas();
		List<ProductoEntity> productos = prodserv.getProductos();
		
		model.addAttribute("categorias", categorias);
		model.addAttribute("laboratorios", laboratorios);
		model.addAttribute("ifas", ifas);
		model.addAttribute("productos", productos);
		
		return "Producto";
	}
	
	@PostMapping("/producto/buscar")
	public String buscar(Model model, int idProd) {
		ProductoEntity producto = prodserv.getProductoById(idProd);
		List<ProductoEntity> productos = null;
		
		if (producto == null) {
			productos = prodserv.getProductos();
		} 

		List<CategoriaEntity> categorias = catserv.getCategorias();
		List<LaboratorioEntity> laboratorios = labserv.getLaboratorios();
		List<IfaEntity> ifas = ifaserv.getIfas();
		
		model.addAttribute("categorias", categorias);
		model.addAttribute("laboratorios", laboratorios);
		model.addAttribute("ifas", ifas);
		model.addAttribute("productos", productos);
		
		return "Producto";
	}
	
	@GetMapping("/producto/registrar")
	public String registrarProd(Model model) {
		ProductoEntity productos = new ProductoEntity();
		List<CategoriaEntity> categorias = catserv.getCategorias();
		List<LaboratorioEntity> laboratorios = labserv.getLaboratorios();
		List<IfaEntity> ifas = ifaserv.getIfas();
		
		model.addAttribute("productos", productos);
		model.addAttribute("categorias", categorias);
		model.addAttribute("laboratorios", laboratorios);
		model.addAttribute("ifas", ifas);
		return "MantenimientoProd";
	}
	
	@GetMapping("/producto/editar/{id}")
	public String actualizarProd(@PathVariable int id, Model model) {
		ProductoEntity productos = prodserv.getProductoById(id);
		
		List<CategoriaEntity> categorias = catserv.getCategorias();
		List<LaboratorioEntity> laboratorios = labserv.getLaboratorios();
		List<IfaEntity> ifas = ifaserv.getIfas();
		
		model.addAttribute("productos", productos);
		model.addAttribute("categorias", categorias);
		model.addAttribute("laboratorios", laboratorios);
		model.addAttribute("ifas", ifas);
		
		return "MantenimientoProd";
	}
	
	@PostMapping("/producto/save")
	public String saveProd(@ModelAttribute (name = "productos") ProductoEntity bean,
						   RedirectAttributes redirect) {
		prodserv.mantener(bean);
		redirect.addFlashAttribute("mensaje", "PRODUCTO REGISTRADO/ACTUALIZADO CORRECTAMENTE");
		return "redirect:/producto/registrar";
	}
	
	@GetMapping("/producto/eliminar/{id}")
	public String eliminarProd(@PathVariable int id, Model model) {
		ProductoEntity productos = prodserv.getProductoById(id);
		model.addAttribute("productos", productos);
		return "EliminarProd";
	}
	
	@PostMapping("/producto/delete")
	public String deleteProd(@ModelAttribute (name = "productos") ProductoEntity bean) {
		prodserv.eliminar(bean);
		return "redirect:/producto";
	}
	
	@GetMapping("/exportarProductos")
	public String export(Model model) {
		List<ProductoEntity> productos = prodserv.getProductos();
		model.addAttribute("productos", productos);
		return "/exportarProductos";
	}
	
	@GetMapping("/producto/laboratorio")
	public String laboratorio(Model model) {
		List<LaboratorioEntity> laboratorios = labserv.getLaboratorios();
		model.addAttribute("laboratorios", laboratorios);
		return "Laboratorio";
	}
	
	@PostMapping("/producto/laboratorio/save")
	public String saveLab(@ModelAttribute (name = "laboratorios") LaboratorioEntity bean,
			              RedirectAttributes redirect) {
		labserv.saveLab(bean);
		
		return "redirect:/producto/laboratorio";
	}
	
}
