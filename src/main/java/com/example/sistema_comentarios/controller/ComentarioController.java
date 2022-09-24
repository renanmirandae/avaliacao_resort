package com.example.sistema_comentarios.controller;

import com.example.sistema_comentarios.entity.ComentarioEntity;
import com.example.sistema_comentarios.service.impl.ComentarioServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComentarioController {

    private final ComentarioServiceImpl comentarioService;

    public ComentarioController(ComentarioServiceImpl comentarioService) {
        this.comentarioService = comentarioService;
    }

    @PostMapping(value="/avaliar")
    public ComentarioEntity avaliar(@RequestBody ComentarioEntity comentarioEntity)
    {
        return this.comentarioService.avaliar(comentarioEntity);
    }

    @GetMapping(value="/avaliacoes")
    public List<ComentarioEntity> mostrarAvaliacoes()
    {
        return this.comentarioService.mostrarAvaliacoes();
    }
}
