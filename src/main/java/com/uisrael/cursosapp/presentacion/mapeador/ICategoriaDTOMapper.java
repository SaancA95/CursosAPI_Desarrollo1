package com.uisrael.cursosapp.presentacion.mapeador;

import com.uisrael.cursosapp.dominio.entidades.Categorias;

import com.uisrael.cursosapp.presentacion.dto.request.CategoriaRequestDTO;

public interface ICategoriaDTOMapper {
	Categorias toDomain(CategoriaRequestDTO dto);

	CategoriaRequestDTO toResponseDTO(Categorias curso);
}
