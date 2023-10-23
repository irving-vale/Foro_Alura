package com.joirv.app.foro.model.dao;

import com.joirv.app.foro.model.entity.curs.Curso;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface CursoDao  extends CrudRepository<Curso,Long> {

    Page<Curso> findAll(Pageable pageable);
}
