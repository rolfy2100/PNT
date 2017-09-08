package com.pnt.modelo;

public class Bebidas extends Producto{

	private double cantidad;
	
	public Bebidas(String nom, int pre, double cant){
		
		super(nom, pre);
	
		cantidad=cant;
		
	}
	
	public String getDatos(){
		
		return "Nombre: " + getNombre() + " /// Litros " + cantidad + " /// Precio: $" + getPrecio();
	
	}
	
}
