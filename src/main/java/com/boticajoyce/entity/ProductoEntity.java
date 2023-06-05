package com.boticajoyce.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_producto")
public class ProductoEntity {
	@Id
	@Column(name = "id_producto" )
	private int id;
	
	@Column(name = "nombre_producto")
	private String nombre;
	
	@Column(name = "laboratorio")
	private String laboratorio;
	
	@Column(name = "stock_unidades")
	private int stock;
	
	@Column(name = "precio_unidad")
	private double precio_unidad;
	
	@Column(name = "precio_empaq")
	private double precio_empaq;
	
	@Temporal(value = TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_de_caducidad")
	private Date fechacad;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriaEntity categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(double precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public double getPrecio_empaq() {
		return precio_empaq;
	}

	public void setPrecio_empaq(double precio_empaq) {
		this.precio_empaq = precio_empaq;
	}

	public Date getFechacad() {
		return fechacad;
	}

	public void setFechacad(Date fechacad) {
		this.fechacad = fechacad;
	}

	public CategoriaEntity getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	
	
	
}
