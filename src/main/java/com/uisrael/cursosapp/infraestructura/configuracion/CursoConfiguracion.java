package com.uisrael.cursosapp.infraestructura.configuracion;

import org.springframework.context.annotation.Bean;

import com.uisrael.cursosapp.aplicacion.casouso.entrada.ICursoUseCase;
import com.uisrael.cursosapp.aplicacion.casouso.impl.CursoUseCaseImpl;
import com.uisrael.cursosapp.dominio.repositorios.ICursoRepositorio;
import com.uisrael.cursosapp.infraestructura.persistencia.adaptadores.CursoRepositorioImpl;
import com.uisrael.cursosapp.infraestructura.persistencia.mapeadores.ICursoJpaMapper;
import com.uisrael.cursosapp.infraestructura.repositorios.ICursoJpaRepositorio;

public class CursoConfiguracion {
	@Bean
	ICursoRepositorio cursoRepositorio(ICursoJpaRepositorio jpaRepositorio, ICursoJpaMapper mapper) {
		return new CursoRepositorioImpl(jpaRepositorio,mapper);
	}
	
	@Bean
	ICursoUseCase cursoUseCase(ICursoRepositorio repositorio) {
		return new CursoUseCaseImpl(repositorio);
	}
	
	
	
	

}
