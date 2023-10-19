package com.joirv.app.foro.model.dao;

import com.joirv.app.foro.model.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario,Long> {
}
