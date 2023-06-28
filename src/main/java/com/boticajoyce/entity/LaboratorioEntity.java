package com.boticajoyce.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_laboratorio")
public class LaboratorioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_laboratorio")
	private int id_laboratorio;
	
	@Column(name = "nombre_laboratorio")
	private String nombre_laboratorio;
	
	@OneToMany(mappedBy = "laboratorio")
	private List<ProductoEntity> productos;

	public int getId_laboratorio() {
		return id_laboratorio;
	}

	public void setId_laboratorio(int id_laboratorio) {
		this.id_laboratorio = id_laboratorio;
	}

	public String getNombre_laboratorio() {
		return nombre_laboratorio;
	}

	public void setNombre_laboratorio(String nombre_laboratorio) {
		this.nombre_laboratorio = nombre_laboratorio;
	}

	public List<ProductoEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoEntity> productos) {
		this.productos = productos;
	}
	
	
}
