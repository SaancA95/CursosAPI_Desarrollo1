package com.uisrael.cursosapp.infraestructura.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursosapi.infraestructura.persistencia.jpa.CursoJpa;

public interface JClienteJpaRepositorio extends JpaRepository<CursoJpa,Integer>{

}
