package com.uisrael.cursosapp.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.cursosapp.aplicacion.casouso.entrada.ICategoriaUseCase;
import com.uisrael.cursosapp.dominio.entidades.Categorias;
import com.uisrael.cursosapp.dominio.repositorios.ICategoriaRepositorio;


public class CategoriaUseCaseImpl implements ICategoriaUseCase {

	private final ICategoriaRepositorio repositorio;

	

	private CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@Override
	public Categorias crear(Categorias categoria) {
		// TODO Auto-generated method stub
		return repositorio.guardar(categoria);
	}

	@Override
	public Categorias obtenerPorId(int id) {
		// TODO Auto-generated method stub
		return repositorio.buscarPorId(id)
				.orElseThrow(()-> new RuntimeException("Categoria no encontrada"));
	}

	@Override
	public List<Categorias> Listar() {
		// TODO Auto-generated method stub
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int id) {
		repositorio.eliminar(id);

	}
}
