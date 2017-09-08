package com.pnt.vista;

import java.util.ArrayList; 

import com.pnt.modelo.Bebidas;
import com.pnt.modelo.FrutVer;
import com.pnt.modelo.Producto;
import com.pnt.modelo.Shampoo;

public final class Test {

	public static void main(String[] args) {

		Bebidas cocaZero=new Bebidas("Coca-cola Zero", 20, 1.5);
		Bebidas coca=new Bebidas("Coca-cola", 18, 1.5);
		Shampoo sedal=new Shampoo("Shampoo sedal", 19, "500ml");
		FrutVer frutilla=new FrutVer("Frutillas", 64, "kilo");

		ArrayList <Producto> productos = new ArrayList<Producto>();
		productos.add(cocaZero);
		productos.add(coca);
		productos.add(sedal);
		productos.add(frutilla);

		for (Producto producto : productos) {

			System.out.println(producto.getDatos());
		}
		System.out.println("=============================");

		String mayor="";

		String menor="";

		double i=0;

		double j=0;

		for(Producto producto : productos){

			if(i<producto.getPrecio()){

				i=producto.getPrecio();

				mayor=producto.getNombre();
			}

			if(j>producto.getPrecio()||j==0){

				j=producto.getPrecio();

				menor=producto.getNombre();

			}
		}

		System.out.println("Producto más caro: " + mayor);

		System.out.println("Producto más barato: " + menor);

	}

}
