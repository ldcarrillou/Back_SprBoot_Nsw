package com.credibanco.assessment.library.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.assessment.library.model.Autor;

public interface AutorDTO extends JpaRepository<Autor, Long> {

}
