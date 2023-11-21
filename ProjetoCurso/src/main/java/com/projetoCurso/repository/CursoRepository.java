package com.projetoCurso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoCurso.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
