package com;

public class Celular {

	String marca;
	int boton;
	String color;
	String material;
	String modelo;
	public Celular() {
		// TODO Auto-generated constructor stub
	}
	public Celular(String marca, int botones, String colores, String materiales, String modelos) {
		
		this.marca = marca;
		this.boton = botones;
		this.color = colores;
		this.material = materiales;
		this.modelo = modelos;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getBotones() {
		return boton;
	}
	public void setBotones(int botones) {
		this.boton = botones;
	}
	public String getColores() {
		return color;
	}
	public void setColores(String colores) {
		this.color = colores;
	}
	public String getMateriales() {
		return material;
	}
	public void setMateriales(String materiales) {
		this.material = materiales;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelos) {
		this.modelo = modelos;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", boton=" + boton + ", color=" + color + ", material=" + material
				+ ", modelo=" + modelo + "]";
	}
	
	
}
