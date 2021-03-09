package com.edivan.escolaSwagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escolaSwagger.entity.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long> {

}
