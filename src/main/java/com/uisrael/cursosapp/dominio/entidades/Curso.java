package com.uisrael.cursosapp.dominio.entidades;

import java.io.Serializable;

public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	private final int idCurso;
	private final String nombre;
	private final String descripcion;
	private final int duracion;
	private final boolean estado;

	private Curso(int idCurso, String nombre, String descripcion, int duracion, boolean estado) {
		super();
		this.idCurso = idCurso;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracion = duracion;
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public boolean isEstado() {
		return estado;
	}
	
	

}
