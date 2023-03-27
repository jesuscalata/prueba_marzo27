package com;

public class Smarphone extends Celular {
	
	
	String SisOpe;
	Ram ram;
	
public Smarphone(){
		
	}


public Smarphone(String sisOpe, Ram ram) {
	
	this.SisOpe = sisOpe;
	this.ram = ram;
	
}



public Smarphone(String marca, int botones, String colores, String materiales, String modelos, String sisOpe, Ram ram) {
	super(marca, botones, colores, materiales, modelos);
	SisOpe = sisOpe;
	this.ram = ram;
}


public Ram getRam() {
	return ram;
}


public void setRam(Ram ram) {
	this.ram = ram;
}


public String getSisOpe() {
	return SisOpe;
}
public void setSisOpe(String sisOpe) {
	this.SisOpe = sisOpe;
}


@Override
public String toString() {
	return "Smarphone [SisOpe=" + SisOpe + ", ram=" + ram + ", marca=" + marca + ", boton=" + boton + ", color=" + color
			+ ", material=" + material + ", modelo=" + modelo + "]";
}




}
