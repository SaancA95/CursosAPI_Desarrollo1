package com.uisrael.cursosapp.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapp.infraestructura.persistencia.jpa.CategoriaJpa;

public interface ICategoriaJpaRepositorio extends JpaRepository<CategoriaJpa, Integer> {

}
