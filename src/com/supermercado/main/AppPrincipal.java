package com.supermercado.main;

import com.supermercado.metodos.Supermercado;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Supermercado superMercado = new Supermercado();
		
		superMercado.verProductos();
		
		superMercado.productoMasCaro();
		
		superMercado.productoMasBarato();

	}

}
