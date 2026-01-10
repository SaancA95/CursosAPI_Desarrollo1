package com.uisrael.cursosapp.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.cursosapp.aplicacion.casouso.entrada.ICursoUseCase;
import com.uisrael.cursosapp.dominio.entidades.Curso;
import com.uisrael.cursosapp.dominio.repositorios.ICursoRepositorio;

public class CursoUseCaseImpl implements ICursoUseCase {
	// dependencias
	private final ICursoRepositorio repositorio;

	// constructor
	public CursoUseCaseImpl(ICursoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	// metodos
	@Override
	public Curso crear(Curso curso) {
		// TODO Auto-generated method stub
		return repositorio.guardar(curso);
	}

	@Override
	public Curso obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(id)
				.orElseThrow(()-> new RuntimeException("Curso no encontrado"));
	}

	@Override
	public List<Curso> Listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);

	}

}
