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

	public int getIdetalleventa() {
		return idetalleventa;
	}

	public void setIdetalleventa(int idetalleventa) {
		this.idetalleventa = idetalleventa;
	}

	public VentaEntity getVenta() {
		return venta;
	}

	public void setVenta(VentaEntity venta) {
		this.venta = venta;
	}

	public ProductoEntity getProducto() {
		return producto;
	}

	public void setProducto(ProductoEntity producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
