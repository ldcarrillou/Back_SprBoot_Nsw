package com.credibanco.assessment.library.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assessment.library.dto.EditorialDTO;
import com.credibanco.assessment.library.model.Editorial;

@Service
public class EditorialService {
	
	@Autowired
	private EditorialDTO editorialDTO;
	
	public Editorial create (Editorial editorial) {
		return editorialDTO.save(editorial);
	}
	
	public List<Editorial> getAllEditoriales () {
		return editorialDTO.findAll();
	}
	
	public void delete (Editorial editorial) {
		editorialDTO.delete(editorial);
	}
	
	public Optional<Editorial> findById (Long id) {
		return editorialDTO.findById(id);
	}

}
