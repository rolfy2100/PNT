package com.pnt.modelo;

public abstract class Producto {

	private String nombre;
	
	private int precio;
	
	public Producto(String nom, int pre){
		
		nombre=nom;
		precio=pre;
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public abstract String getDatos();
	
}
