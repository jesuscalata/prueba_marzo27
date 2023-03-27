package com;

public class Principal {
	public static void main(String[] args) {
		Celular c=new Celular();
		
		c.setMarca("Nokia");
		c.setBotones(25);
		c.setModelo("5530");
		c.setColores("Negro");
		c.setMateriales("Plastico");
		
		System.out.println(c);
		
		Smarphone s= new Smarphone();
		
		s.setMarca("Huawei");
		s.setColores("dorado");
		
		//llamada a metodo nativo de lcase hija
		s.setSisOpe("Android");
		System.out.println(s);
		
		Ram ram1=new Ram(12, 5.500, "ddr5", "KINGSTON");
		Smarphone s1= new Smarphone("WindowsPhone", ram1);
		
		System.out.println(s1);
		
		Smarphone s3 = new Smarphone("Xiaomi", 3, "azul", "metal", "Red mi note 10 pro", "android", ram1);
		System.out.println(s3);
}
}
