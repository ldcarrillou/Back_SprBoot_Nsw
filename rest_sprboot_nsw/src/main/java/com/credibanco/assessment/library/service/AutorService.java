package com.credibanco.assessment.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dto.AutorDTO;
import com.credibanco.assessment.library.model.Autor;

@Service
public class AutorService {

	@Autowired
	private AutorDTO autorDTO;
	
	public Autor create (Autor autor) {
		return autorDTO.save(autor);
	}
	
	public List<Autor> getAllAutores () {
		return autorDTO.findAll();
	}
	
	public void delete (Autor autor) {
		autorDTO.delete(autor);
	}
	
	public Optional<Autor> findById (Long id) {
		return autorDTO.findById(id);
	}
}
