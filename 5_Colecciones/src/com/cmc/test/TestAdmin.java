package com.cmc.test;

import java.util.ArrayList;

import com.cmc.colecciones.AdminPersona;
import com.cmc.entidades.Persona;

public class TestAdmin {
	
	public static void main(String[] args) {
		AdminPersona admin = new AdminPersona();
		admin.agregar(new Persona("Malcon", 10));
		admin.agregar(new Persona("Reese", 12));
		admin.agregar(new Persona("Jhon", 12));
		
		admin.imprimir();
		
		Persona personaBuscada = admin.buscar("reese");
		if(personaBuscada == null) {
			System.out.println("No exite");
		} else {
			System.out.println("Encontrado: " + personaBuscada.getNombre());	
		}
		
		ArrayList<Persona> ps = admin.buscarMayores(15);
		System.out.println(ps.size());
	}
}
