package com.joirv.app.foro.model.entity.topic;


import com.joirv.app.foro.model.entity.Respuesta;
import com.joirv.app.foro.model.entity.StatusTopico;
import com.joirv.app.foro.model.entity.curs.Curso;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "topicos")

public class Topico {
    @Id
    @Column(name = "id_topico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "mensaje")
    private String mensaje;
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Column(name = "status_topico")
    private StatusTopico status = StatusTopico.NO_RESPONDIDO;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    @OneToMany
    @JoinColumn(name = "respuestas_id")
    private List<Respuesta> respuesta = new ArrayList<>();




}
