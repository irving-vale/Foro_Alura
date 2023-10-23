package com.joirv.app.foro.service.impl;

import com.joirv.app.foro.model.dao.CursoDao;
import com.joirv.app.foro.model.entity.curs.Curso;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import com.joirv.app.foro.service.ICurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CursoImpl implements ICurso {

    @Autowired
    private CursoDao cursoDao;
    @Transactional
    @Override
    public Curso save(Curso curso) {
        return cursoDao.save(curso);
    }

    @Transactional
    @Override
    public Curso finById(Long id) {
        return cursoDao.findById(id).orElse(null);
    }

    @Transactional
    @Override
    public void delete(Curso curso) {
        cursoDao.delete(curso);
    }

    @Override
    public Page<Curso> list(Pageable pageable) {
        return cursoDao.findAll(pageable);
    }
}
