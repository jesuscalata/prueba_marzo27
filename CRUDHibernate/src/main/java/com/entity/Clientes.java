package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.swing.text.StyledEditorKit.BoldAction;

@Entity
@Table(name="CLIENTES")
public class Clientes {

	

	public Clientes() {}
	
	public Clientes(int id) {
		this.clienteId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CLIENTE_SEQ")
	
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	int clienteId;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(15)")
	String nombre;
	@Column(name="APELLIDO", columnDefinition="NVARCHAR2(20)")
	String apellido;
	@Column(name="RFC", columnDefinition="NVARCHAR2(13)")
	String rfc;
	@Column(name="FECHA_NAC", columnDefinition="DATE")
	Date fechaNac;
	@Column(name="STATUS", columnDefinition="NUMBER")
	double status;
	//Getters & setters
	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public double getStatus() {
		return status;
	}

	public void setStatus(double status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Clientes [clienteId=" + clienteId + ", nombre=" + nombre + ", apellido=" + apellido + ", rfc=" + rfc
				+ ", fechaNac=" + fechaNac + ", status=" + status + "]";
	}
	
	
}
