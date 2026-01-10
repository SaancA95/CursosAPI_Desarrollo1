package com.uisrael.cursosapp.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.cursosapp.dominio.entidades.Curso;

public interface ICursoUseCase {
	Curso crear(Curso curso);

	Curso obtenerPorId(int id);

	List<Curso> Listar();

	void eliminar(int id);

}
