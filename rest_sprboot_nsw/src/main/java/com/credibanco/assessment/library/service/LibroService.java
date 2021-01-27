package com.credibanco.assessment.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dto.LibroDTO;
import com.credibanco.assessment.library.model.Libro;

@Service
public class LibroService {
	
	@Autowired
	private LibroDTO libroDTO;
	
	public Libro create (Libro libro) {
		return libroDTO.save(libro);
	}
	
	public List<Libro> getAllLibros () {
		return libroDTO.findAll();
	}
	
	public void delete (Libro libro) {
		libroDTO.delete(libro);
	}
	
	public Optional<Libro> findById (Long id) {
		return libroDTO.findById(id);
	}

}
