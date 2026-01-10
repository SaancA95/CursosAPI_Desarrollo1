package com.uisrael.cursosapp.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.cursosapp.dominio.entidades.Curso;
import com.uisrael.cursosapp.infraestructura.persistencia.jpa.CursosJpa;



@Mapper(componentModel = "spring")
public interface ICursoJpaMapper {

	Curso toDomain(CursosJpa entity);

	CursosJpa toEntity(Curso curso);
}
