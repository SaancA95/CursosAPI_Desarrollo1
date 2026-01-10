package com.uisrael.cursosapp.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.cursosapp.dominio.entidades.Categorias;

public interface ICategoriaUseCase {
	Categorias crear(Categorias categoria);

	Categorias obtenerPorId(int id);

	List<Categorias> Listar();

	void eliminar(int id);

}
