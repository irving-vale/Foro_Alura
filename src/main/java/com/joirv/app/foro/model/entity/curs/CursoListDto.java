package com.joirv.app.foro.model.entity.curs;

import com.joirv.app.foro.model.entity.usuarios.Usuario;

public record CursoListDto(
        Long id,
        String nombre,
        String categoria
) {

    public CursoListDto(Curso curso) {
        this(curso.getId(), curso.getNombre(), curso.getCategoria());
    }
}
