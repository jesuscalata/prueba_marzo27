package com;

public abstract class Calculadora {
	
	String marca, modelo;
	
	public Calculadora() {
		
		
	}

	public Calculadora(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public abstract double sumar(double a, double b);
	public abstract double restar(double a, double b);

	
	
}
