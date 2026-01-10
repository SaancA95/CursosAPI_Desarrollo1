package com.uisrael.cursosapp.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapp.infraestructura.persistencia.jpa.CursosJpa;

public interface ICursoJpaRepositorio extends JpaRepository<CursosJpa,Integer>{

}
