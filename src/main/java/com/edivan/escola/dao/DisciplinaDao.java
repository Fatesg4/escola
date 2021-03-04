package com.edivan.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escola.entity.Disciplina;

@Repository
public interface DisciplinaDao extends JpaRepository<Disciplina, Long> {

}
