package com.edivan.escola.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edivan.escola.dao.PessoaDao;
import com.edivan.escola.entity.Pessoa;

@RestController
@RequestMapping("/curso")
//@Api(value = "API Rest Curso")
public class PessoaRest {
	
	private PessoaDao pessoaDao;
	
	@GetMapping
	public List<Pessoa> get(){
		return pessoaDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping
	public void delete(@PathVariable("id") Long id) {
		pessoaDao.deleteById(id);
	}
	
	
}
