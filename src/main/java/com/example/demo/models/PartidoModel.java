package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "partidos", schema = "public")
public class PartidoModel {

	@Id
	@Column(name = "idpartido")
	private int idpartido;

	@Column(name = "nombre")
	private String nombre;

	public int getIdpartido() {
		return idpartido;
	}

	public void setIdpartido(int idpartido) {
		this.idpartido = idpartido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
