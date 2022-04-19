package com.supermercado.metodos;

import com.supermercado.entidades.Producto;

public class ProductoMasBarato {

	public String masBarato () {
		Producto min;
		min = Supermercado.listaProductos.get(0);
		for (Producto producto : Supermercado.listaProductos) {
			
			if (producto.compareTo(min) < 0) {
				min = producto;
			}
		}
		
		return min.getNombre();
	}

	@Override
	public String toString() {
		return "*Producto más barato: " + masBarato();
	}
	
}
