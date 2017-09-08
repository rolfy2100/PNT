package com.pnt.modelo;

public class FrutVer extends Producto{

	private String uniVenta;
	
	
	public FrutVer(String nom, int pre, String unidad){
		
		super(nom, pre);
		
		uniVenta=unidad;
	}
	
	public String getDatos(){

		return "Nombre: " + this.getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + uniVenta;

	}
}
