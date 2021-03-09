package com.edivan.escolaSwagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escolaSwagger.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
