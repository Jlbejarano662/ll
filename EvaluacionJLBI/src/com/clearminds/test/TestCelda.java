package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
		
		/* 
		 * El NullPointerException ocurre en la linea 8 de la clase TestCelda producto de 
		 * la variable celda.getProducto().getNombre(), ya que esta tiene un valor NULL, porque no 
		 * se le ha asignado un producto al objeto celda.
		 * */
		
	}
}