package com.msasunto.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
property = "asuntoId")
@Entity
@Table(name="ASUNTO")
public class Asunto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_asun")
	@SequenceGenerator(name="id_asun", sequenceName="ASUNTO_SEQ", allocationSize =1)
	@Column(name="NUM_EXPEDIENTE", columnDefinition="NUMBER")
	private int asuntoId;
	
	@Column(name="FECHA_INICIO", columnDefinition="DATE")
	private LocalDateTime fechaI;
	@Column(name="FECHA_FIN", columnDefinition="DATE")
	private LocalDateTime fechaF;
	@Column(name="STATUS", columnDefinition="NVARCHAR2(10)")
	private String status;
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int cliente_id;
	public int getAsuntoId() {
		return asuntoId;
	}
	public void setAsuntoId(int asuntoId) {
		this.asuntoId = asuntoId;
	}
	public LocalDateTime getFechaI() {
		return fechaI;
	}
	public void setFechaI(LocalDateTime fechaI) {
		this.fechaI = fechaI;
	}
	public LocalDateTime getFechaF() {
		return fechaF;
	}
	public void setFechaF(LocalDateTime fechaF) {
		this.fechaF = fechaF;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCliente_id() {
		return cliente_id;
	}
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Asunto [asuntoId=" + asuntoId + ", fechaI=" + fechaI + ", fechaF=" + fechaF + ", status=" + status
				+ ", cliente_id=" + cliente_id + "]";
	}


}
