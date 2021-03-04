package com.edivan.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escola.entity.MatriculaDisciplinaPessoa;

@Repository
public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long>{

}
