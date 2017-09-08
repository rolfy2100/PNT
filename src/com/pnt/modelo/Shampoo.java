package com.pnt.modelo;

public class Shampoo extends Producto{

	private String contenido;
	
	public Shampoo(String nom, int pre, String conten){

		super(nom, pre);

		contenido=conten;

	}

	public String getDatos(){

		return "Nombre: " + this.getNombre() + " /// Contenido: " + contenido + " /// Precio: $" + getPrecio();
	}
}
