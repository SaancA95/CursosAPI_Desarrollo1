package com.uisrael.cursosapp.dominio.entidades;

public class Categorias {

	private final int idCategoria;
	private final String nombre;
	private final String desccripcion;
	private final boolean estado;
	
	public Categorias(int idCategoria, String nombre, String desccripcion, boolean estado) {
	
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.desccripcion = desccripcion;
		this.estado = estado;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDesccripcion() {
		return desccripcion;
	}

	public boolean isEstado() {
		return estado;
	}
	
	
}
