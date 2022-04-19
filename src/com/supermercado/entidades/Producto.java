package com.supermercado.entidades;

public class Producto implements Comparable<Producto>{
	
	private String nombre;
	private String tipoUnidad;
	private double capacidad;
	private double precio;
	
	public Producto() {
	}

	public Producto(String nombre, String tipoUnidad, double capacidad, double precio) {
		this.nombre = nombre;
		this.tipoUnidad = tipoUnidad;
		this.capacidad = capacidad;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public String getTipoUnidad() {
		return tipoUnidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	@Override
	public int compareTo(Producto o) {
		return this.getPrecio() > o.getPrecio() ?1: this.getPrecio() < o.getPrecio() ?-1: 0;	
	}
	
}
