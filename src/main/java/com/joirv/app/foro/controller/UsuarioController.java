package com.joirv.app.foro.controller;

import com.joirv.app.foro.model.entity.Usuario;
import com.joirv.app.foro.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private IUsuario usuarioService;

    @PostMapping("usuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.save(usuario);
    }

    @GetMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario showById(@PathVariable Long id){
        return usuarioService.finById(id);
    }
}
