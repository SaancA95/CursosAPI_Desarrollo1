package com.uisrael.cursosapp.presentacion.controlador;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.cursosapp.aplicacion.casouso.entrada.ICursoUseCase;
import com.uisrael.cursosapp.presentacion.dto.request.CursoRequestDTO;
import com.uisrael.cursosapp.presentacion.dto.response.CursoResponseDTO;
import com.uisrael.cursosapp.presentacion.mapeador.ICursoDTOMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/curso")
public class CursoControlador {
	private final ICursoUseCase cursoUseCase;
	private final ICursoDTOMapper mapper;

	private CursoControlador(ICursoUseCase cursoUseCase, ICursoDTOMapper mapper) {
		super();
		this.cursoUseCase = cursoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CursoResponseDTO crear(@Valid @RequestBody CursoRequestDTO request) {
		return mapper.toResponseDTO(cursoUseCase.crear(mapper.toDomain(request)));
	}

	@GetMapping
	public List<CursoResponseDTO> listar() {
		return cursoUseCase.Listar().stream().map(mapper::toResponseDTO).toList();

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable int id) {
		cursoUseCase.eliminar(id);
		return ResponseEntity.noContent().build();
	}

}
