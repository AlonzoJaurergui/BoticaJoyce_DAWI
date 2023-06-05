package com.boticajoyce.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_receta")
public class RecetaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_receta")
	private int idreceta;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClienteEntity cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_empleado")
	private EmpleadoEntity empleado;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fecha_receta")
	private Date fecha;
	
	@Column(name = "detalle_receta")
	private String detalle_receta;

	public int getIdreceta() {
		return idreceta;
	}

	public void setIdreceta(int idreceta) {
		this.idreceta = idreceta;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}

	public EmpleadoEntity getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEntity empleado) {
		this.empleado = empleado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getDetalle_receta() {
		return detalle_receta;
	}

	public void setDetalle_receta(String detalle_receta) {
		this.detalle_receta = detalle_receta;
	}
	
	
}
