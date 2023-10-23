package com.joirv.app.foro.service;

import com.joirv.app.foro.model.entity.curs.Curso;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICurso {

    Curso save(Curso curso);

    Curso finById(Long id);
    void delete(Curso curso);

    Page<Curso> list (Pageable pageable);
}
