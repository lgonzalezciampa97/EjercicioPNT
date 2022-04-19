package com.supermercado.entidades;

public class Higiene extends Producto{
	
	public Higiene (String nom, String tip, double cant, double pre) {
		super (nom, tip, cant, pre);
	}
	
	@Override
	public String toString() {
		return "Nombre: "+this.getNombre()+" /// "+
				"Contenido: "+(int)this.getCapacidad()+"ml"+" /// " +
				"Precio: "+"$"+(int)this.getPrecio();
	}
}
