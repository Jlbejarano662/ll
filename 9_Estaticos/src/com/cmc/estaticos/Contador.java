package com.cmc.estaticos;

public class Contador {

	private int contadorNormal;
	private static int contadorEstatico;
	private String nombre;
	
	public Contador(String nombre) {
		this.nombre = nombre;
	}
	public void incrementar() {
		contadorNormal = contadorNormal + 1;
		contadorEstatico = contadorEstatico + 1;
	}
	
	public void imprimir() {
		System.out.println(nombre + " contadorNormal: " + contadorNormal);
		System.out.println(nombre + " contadorEstatico: " + contadorEstatico);
	}
	
	/*Los atributos est�ticos son de la clase, no del objeto, por tanto, pueden existir muchas instancias de la clase,
	 * pero todas hacen referencia al mismo atributo est�tico que va estar en la clse.
	 * */
}
