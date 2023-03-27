package com.msasunto.request;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class AsuntoRequest {


	private int asuntoId;
	private LocalDateTime fechaI;
	private LocalDateTime fechaF;
	private String status;
	private int cliente_id;
	
	AsuntoRequest(){
		
	}

	public AsuntoRequest(int asuntoId, LocalDateTime fechaI, LocalDateTime fechaF, String status, int cliente_id) {
		
		this.asuntoId = asuntoId;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.status = status;
		this.cliente_id = cliente_id;
	}

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

	@Override
	public String toString() {
		return "AsuntoRequest [asuntoId=" + asuntoId + ", fechaI=" + fechaI + ", fechaF=" + fechaF + ", status="
				+ status + ", cliente_id=" + cliente_id + "]";
	}
	
	
}
