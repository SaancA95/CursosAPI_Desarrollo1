package com.uisrael.cursosapp.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class CategoriaRequestDTO {
	@NotBlank
	private int idCategoria;
	@NotBlank
	private String nombre;
	@NotBlank
	private String desccripcion;
	@NotBlank
	private boolean estado;
}
