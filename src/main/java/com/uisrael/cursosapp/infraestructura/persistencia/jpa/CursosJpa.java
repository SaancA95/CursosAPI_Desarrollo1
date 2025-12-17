package com.uisrael.cursosapp.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "ins_curso")
public class CursosJpa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	@Column(name = "cur_nombre",length = 80)
	private String nombre;
	private String descripcion;
	private int duracion;
	private Date fecha;
	private boolean estado;
}
