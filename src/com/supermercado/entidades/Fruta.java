package com.supermercado.entidades;

public class Fruta extends Producto{
	
	public Fruta (String nom, String tip, double cant, double pre) {
		super (nom, tip, cant, pre);
	}

	
	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " /// " 
				+ "Precio: " + "$" + (int)this.getPrecio() + " /// " 
				+ "Unidad de venta: " + this.getTipoUnidad() + 
				"\n=============================";
	}
	
}
