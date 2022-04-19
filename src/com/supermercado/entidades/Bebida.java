package com.supermercado.entidades;

public class Bebida extends Producto{
	
	public Bebida (String nom, String tip, double cant, double pre) {
		super (nom, tip, cant, pre);
	}

	
	@Override
	public String toString() {
		return "Nombre: "+this.getNombre()+" /// "+
				this.getTipoUnidad()+": "+this.getCapacidad()+" /// " +
				"Precio: "+"$"+(int)this.getPrecio();
	}
}
