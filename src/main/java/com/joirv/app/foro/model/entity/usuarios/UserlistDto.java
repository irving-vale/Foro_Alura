package com.joirv.app.foro.model.entity.usuarios;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public record UserlistDto(


        Long id,
        String nombre,
        String email
        ) {

    public UserlistDto(Usuario usuario) {
        this(usuario.getId(),usuario.getNombre(),usuario.getEmail());
    }
}
