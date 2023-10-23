package com.joirv.app.foro.controller;

import com.joirv.app.foro.model.entity.usuarios.UserlistDto;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import com.joirv.app.foro.service.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @DeleteMapping("usuario/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable  Long id){
        Usuario usuarioDelete = usuarioService.finById(id);
        usuarioService.delete(usuarioDelete);
    }

    @GetMapping
    public ResponseEntity<Page<UserlistDto>> list(@PageableDefault Pageable pageable){
        return ResponseEntity.ok(usuarioService.list(pageable).map(UserlistDto::new));

    }
}
