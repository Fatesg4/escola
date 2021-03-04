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

import com.edivan.escola.dao.DisciplinaDao;
import com.edivan.escola.entity.Disciplina;

// oque é rest ?
@RestController
// oque faz ?
@RequestMapping("/disciplina")
public class DisciplinaRest {
	
	@Autowired
	private DisciplinaDao disciplinaDao;
	
	// GRUD
	
	@GetMapping
	public List<Disciplina> get(){
		return disciplinaDao.findAll();
	}
	
	@PostMapping
	public void post (@RequestBody Disciplina disciplina) {
		disciplinaDao.save(disciplina);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") Long id) {
		disciplinaDao.deleteById(id);
	}
}
