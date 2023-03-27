package com;

public class Camara {

	double DistanciaFocal;
	int MegaPixeles;
	int valorIso;
	
	public Camara() {
		
	}

	public Camara(double distanciaFocal, int megaPixeles, int valorIso) {
		super();
		DistanciaFocal = distanciaFocal;
		MegaPixeles = megaPixeles;
		this.valorIso = valorIso;
	}

	public double getDistanciaFocal() {
		return DistanciaFocal;
	}

	public void setDistanciaFocal(double distanciaFocal) {
		DistanciaFocal = distanciaFocal;
	}

	public int getMegaPixeles() {
		return MegaPixeles;
	}

	public void setMegaPixeles(int megaPixeles) {
		MegaPixeles = megaPixeles;
	}

	public int getValorIso() {
		return valorIso;
	}

	public void setValorIso(int valorIso) {
		this.valorIso = valorIso;
	}

	@Override
	public String toString() {
		return "Camara [DistanciaFocal=" + DistanciaFocal + ", MegaPixeles=" + MegaPixeles + ", valorIso=" + valorIso
				+ "]";
	}
	
}
