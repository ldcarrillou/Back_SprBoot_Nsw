package com.credibanco.assessment.library.service.impl;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assessment.library.model.Libro;
import com.credibanco.assessment.library.service.LibroService;

@RestController
@RequestMapping ("/api/libro")
public class LibroImpl {

	@Autowired
	private LibroService libroService;
	
	@PostMapping
	private ResponseEntity<Libro> guardar (@RequestBody Libro libro) {
		Libro temporal = libroService.create(libro);
		
		try {
			return ResponseEntity.created(new URI("/api/libro" + temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@GetMapping
	private ResponseEntity<List<Libro>> listarTodosLibros () {
		return ResponseEntity.ok(libroService.getAllLibros());
	}
	
	@DeleteMapping
	private ResponseEntity<Void> eliminarLibro (@RequestBody Libro libro) {
		libroService.delete(libro);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Libro>> listarLibrosPorId (@PathVariable ("id") Long id) {
		return ResponseEntity.ok(libroService.findById(id));
	}

}
