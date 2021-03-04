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

import com.edivan.escola.dao.CursoDao;
import com.edivan.escola.entity.Curso;

//	oque o rest é ?
@RestController
// 	Oque ele acessar ?
@RequestMapping("/cursos")
public class CursoRest {
	
	@Autowired
	private CursoDao cursoDao;
	
	// Açoes do CRUD
	@GetMapping
	public List<Curso> get(){
		return cursoDao.findAll();
	}
	
	@PostMapping
	private void post(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	
	@DeleteMapping("/{id}")
	private void delete(@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
}
