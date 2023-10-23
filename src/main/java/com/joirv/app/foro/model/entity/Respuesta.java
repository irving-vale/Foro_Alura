package com.joirv.app.foro.model.entity;


import com.joirv.app.foro.model.entity.topic.Topico;
import com.joirv.app.foro.model.entity.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "respuestas")
public class Respuesta {

    @Id
    @Column(name = "id_respuesta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mensaje")
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "topico_id")
    private Topico topico;

    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Usuario autor;
    @Column(name = "solucion")
    private Boolean solucion = false;
}
