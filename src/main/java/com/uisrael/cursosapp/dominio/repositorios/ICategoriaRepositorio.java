package com.uisrael.cursosapp.dominio.repositorios;

import java.util.List;
import java.util.Optional;

import com.uisrael.cursosapp.dominio.entidades.Categorias;

public interface ICategoriaRepositorio {
	Categorias guardar(Categorias categoria);

	Optional<Categorias> buscarPorId(int id);

	List<Categorias> listarTodos();

	void eliminar(int id);
}
