package com.boticajoyce.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ifa")
public class IfaEntity {
	@Id
	@Column(name = "id_ifa")
	private int id_ifa;
	
	@Column(name = "nombre_ifa")
	private String nombre_ifa;
	
	@OneToMany(mappedBy = "ifa")
	private List<ProductoEntity> productos;

	public int getId_ifa() {
		return id_ifa;
	}

	public void setId_ifa(int id_ifa) {
		this.id_ifa = id_ifa;
	}

	public String getNombre_ifa() {
		return nombre_ifa;
	}

	public void setNombre_ifa(String nombre_ifa) {
		this.nombre_ifa = nombre_ifa;
	}

	public List<ProductoEntity> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoEntity> productos) {
		this.productos = productos;
	}
	
	
}
