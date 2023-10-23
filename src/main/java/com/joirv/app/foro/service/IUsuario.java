package com.joirv.app.foro.service;

import com.joirv.app.foro.model.entity.usuarios.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUsuario {

    Usuario save(Usuario usuario);

    Usuario finById(Long id);
    void delete(Usuario usuario);

    Page<Usuario> list (Pageable pageable);

}
