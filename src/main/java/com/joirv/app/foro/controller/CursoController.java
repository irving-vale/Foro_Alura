package com.joirv.app.foro.controller;

import com.joirv.app.foro.model.entity.curs.Curso;
import com.joirv.app.foro.model.entity.curs.CursoListDto;
import com.joirv.app.foro.service.ICurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/curso")
public class CursoController {

    @Autowired
    private ICurso iCursoService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public Curso create(@RequestBody Curso curso){
        return iCursoService.save(curso);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Page<CursoListDto>> list(@PageableDefault Pageable page){
        return ResponseEntity.ok(iCursoService.list(page).map(CursoListDto::new));
    }

}
