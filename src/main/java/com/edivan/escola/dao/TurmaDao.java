package com.edivan.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escola.entity.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long> {

}
