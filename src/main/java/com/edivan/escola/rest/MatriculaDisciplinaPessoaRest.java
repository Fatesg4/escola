package com.edivan.escola.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edivan.escola.dao.MatriculaDisciplinaPessoaDao;
import com.edivan.escola.entity.MatriculaDisciplinaPessoa;

// Oque é rest ?
@RestController
// oque o ele faz?
@RequestMapping("/matricula")
public class MatriculaDisciplinaPessoaRest {
	
	@Autowired
	private MatriculaDisciplinaPessoaDao matriculaDisciplinaPessoaDao;
	
	// CRUD	
	
	@GetMapping
	public List<MatriculaDisciplinaPessoa> get(){
		return matriculaDisciplinaPessoaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody MatriculaDisciplinaPessoa matriculaDisciplinaPessoa) {
		matriculaDisciplinaPessoaDao.save(matriculaDisciplinaPessoa);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		matriculaDisciplinaPessoaDao.deleteById(id);
	}
}
