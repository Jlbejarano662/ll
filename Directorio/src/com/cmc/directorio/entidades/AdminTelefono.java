package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	 public int contarMovi(Telefono a, Telefono b, Telefono c) {
		 int movi = 0;
		 if(a.getOperadora() == "movi") {
			 movi +=1;
		 }
		 if(b.getOperadora() == "movi") {
			 movi +=1;
		 }
		 if(c.getOperadora() == "movi") {
			 movi +=1;
		 }
		 return movi;
	 }
	 
	 public int contarClaro(Telefono a, Telefono b, Telefono c, Telefono d) {
		 int claro = 0;
		 if(a.getOperadora() == "claro") {
			 claro +=1;
		 }
		 if(b.getOperadora() == "claro") {
			 claro +=1;
		 }
		 if(c.getOperadora() == "claro") {
			 claro +=1;
		 }
		 if(d.getOperadora() == "claro") {
			 claro +=1;
		 }
		 return claro;
	 }
	 
}
