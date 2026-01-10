package com.uisrael.cursosapp.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapp.dominio.entidades.Categorias;

import com.uisrael.cursosapp.infraestructura.persistencia.jpa.CategoriaJpa;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {
	Categorias toDomain(CategoriaJpa entity);

	CategoriaJpa toEntity(Categorias categoria);
}
