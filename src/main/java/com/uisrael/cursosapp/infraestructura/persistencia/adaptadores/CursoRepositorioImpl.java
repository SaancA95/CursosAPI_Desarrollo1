package com.uisrael.cursosapp.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;


import com.uisrael.cursosapp.dominio.entidades.Curso;
import com.uisrael.cursosapp.dominio.repositorios.ICursoRepositorio;
import com.uisrael.cursosapp.infraestructura.persistencia.jpa.CursosJpa;
import com.uisrael.cursosapp.infraestructura.persistencia.mapeadores.ICursoJpaMapper;
import com.uisrael.cursosapp.infraestructura.repositorios.ICursoJpaRepositorio;

public class CursoRepositorioImpl implements ICursoRepositorio {

	private final ICursoJpaRepositorio repositorioJpa;
	private final ICursoJpaMapper entityMapper;

	public CursoRepositorioImpl(ICursoJpaRepositorio repositorioJpa, ICursoJpaMapper entityMapper) {

		this.repositorioJpa = repositorioJpa;
		this.entityMapper = entityMapper;
	}

	@Override
	public Curso guardar(Curso curso) {
		CursosJpa entity = entityMapper.toEntity(curso);
		CursosJpa guardado = repositorioJpa.save(entity);

		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Curso> buscarPorId(int id) {

		return repositorioJpa.findById(id).map(entityMapper::toDomain);
	}

	@Override
	public List<Curso> listarTodos() {
		// TODO Auto-generated method stub
		return repositorioJpa.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int id) {
		repositorioJpa.deleteById(id);

	}

}
