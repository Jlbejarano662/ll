package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPesado(Contacto a, Contacto b) {
		if(a.getPeso() > b.getPeso()) {
			return a;
		} else if (b.getPeso() > a.getPeso()) {
			return b;
		} else {
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto a, Contacto b) {
		if (a.getTelefono().getOperadora() == b.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void acivarUsuario(Contacto c) {
		if(c.getTelefono().isTieneWhatsapp() == true) {
			c.setActivo(true);
		}
	}
	
}
