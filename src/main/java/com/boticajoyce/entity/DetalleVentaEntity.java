package com.boticajoyce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_detalle_venta")
public class DetalleVentaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle_venta")
	private int idetalleventa;
	
	@ManyToOne
	@JoinColumn(name = "id_venta")
	private VentaEntity venta;
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductoEntity producto;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "subtotal")
	private double subtotal;
	
	
}
