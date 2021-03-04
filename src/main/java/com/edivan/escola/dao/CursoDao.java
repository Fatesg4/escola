package com.edivan.escola.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edivan.escola.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
