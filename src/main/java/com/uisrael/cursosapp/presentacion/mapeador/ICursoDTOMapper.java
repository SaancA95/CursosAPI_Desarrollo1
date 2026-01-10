package com.uisrael.cursosapp.presentacion.mapeador;

import org.mapstruct.Mapper;

import com.uisrael.cursosapp.dominio.entidades.Curso;
import com.uisrael.cursosapp.presentacion.dto.request.CursoRequestDTO;
import com.uisrael.cursosapp.presentacion.dto.response.CursoResponseDTO;

@Mapper(componentModel = "spring")
public interface ICursoDTOMapper {
	Curso toDomain(CursoRequestDTO dto);

	CursoResponseDTO toResponseDTO(Curso curso);
}
