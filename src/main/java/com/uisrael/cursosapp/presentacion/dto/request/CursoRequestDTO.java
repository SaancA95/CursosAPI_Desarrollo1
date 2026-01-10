package com.uisrael.cursosapp.presentacion.dto.request;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
@Data
public class CursoRequestDTO {
	@NotBlank
	private int idCurso;
	@NotBlank
	private String nombre;
	@NotBlank
	private String descripcion;
	@NotBlank
	private int duracion;
	@NotBlank
	private boolean estado;
	@NotBlank
	private Date fecha;
}
