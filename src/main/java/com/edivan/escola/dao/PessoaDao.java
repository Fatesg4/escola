package com.edivan.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escola.entity.Pessoa;

@Repository
public interface PessoaDao extends JpaRepository<Pessoa, Long>{

}
