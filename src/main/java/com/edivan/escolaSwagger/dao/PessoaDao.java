package com.edivan.escolaSwagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escolaSwagger.entity.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long>{

}
