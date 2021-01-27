package com.credibanco.assessment.library.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	private String genero;
	private int nro_pags;
	private String autor;
	private String editorial;
		
	public Libro(Long id, String titulo, String genero, int nro_pags, String autor, String editorial) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.nro_pags = nro_pags;
		this.autor = autor;
		this.autor = editorial;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getNro_pags() {
		return nro_pags;
	}
	public void setNro_pags(int nro_pags) {
		this.nro_pags = nro_pags;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	

}
