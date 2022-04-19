package com.supermercado.metodos;

import com.supermercado.entidades.Producto;

public class ProductoMasCaro {
	
	public String masCaro () {
		Producto max;
		max = Supermercado.listaProductos.get(0);
		for (Producto producto : Supermercado.listaProductos) {
			
			if (producto.compareTo(max) > 0) {
				max = producto;
			}
		}
		
		return max.getNombre();
	}

	@Override
	public String toString() {
		return "Producto más caro: " + masCaro();
	}
	
	

}
