package com.supermercado.metodos;

import java.util.LinkedList;
import java.util.List;

import com.supermercado.entidades.Bebida;
import com.supermercado.entidades.Fruta;
import com.supermercado.entidades.Producto;
import com.supermercado.entidades.Higiene;

public class Supermercado {

	// creamos la lista para los productos
	public static List<Producto> listaProductos;

	// constructor con la lista a cargar
	public Supermercado() {
		Supermercado.listaProductos = new LinkedList<>();
	}

	// creamos los productos, los guardamos en la lista y luego los imprimimos en pantalla
	public void verProductos() {
		Producto producto1 = new Bebida("Coca-Cola Zero", "Litros", 1.5, 20);
		Producto producto2 = new Bebida("Coca-Cola", "Litros", 1.5, 18);
		Producto producto3 = new Higiene("Shampoo Sedal", "Contenido", 500, 19);
		Producto producto4 = new Fruta("Frutillas", "kilo", 1, 64);

		this.listaProductos.add(producto1);
		this.listaProductos.add(producto2);
		this.listaProductos.add(producto3);
		this.listaProductos.add(producto4);

		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		System.out.println(producto3.toString());
		System.out.println(producto4.toString());
	}

	// metodo para cargar el producto mas caro
	public void productoMasCaro() {
		ProductoMasCaro producto = new ProductoMasCaro();
		producto.masCaro();
		System.out.println(producto.toString());
	}

	// metodo para cargar el producto mas barato
	public void productoMasBarato() {
		ProductoMasBarato producto = new ProductoMasBarato();
		producto.masBarato();
		System.out.println(producto.toString());

	}
}
