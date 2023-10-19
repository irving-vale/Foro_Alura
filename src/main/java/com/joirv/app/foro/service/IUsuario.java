package com.joirv.app.foro.service;

import com.joirv.app.foro.model.entity.Usuario;

public interface IUsuario {

    Usuario save(Usuario usuario);

    Usuario finById(Long id);
    void delete(Usuario usuario);

}
