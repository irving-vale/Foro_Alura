package com.joirv.app.foro.service.impl;

import com.joirv.app.foro.model.dao.UsuarioDao;
import com.joirv.app.foro.model.entity.Usuario;
import com.joirv.app.foro.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioImpl implements IUsuario {

    @Autowired
    private UsuarioDao usuarioDao;
    @Transactional
    @Override
    public Usuario save(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario finById(Long id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }
}
