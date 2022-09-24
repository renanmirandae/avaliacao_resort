package com.example.sistema_comentarios.service.impl;

import com.example.sistema_comentarios.entity.ComentarioEntity;
import com.example.sistema_comentarios.repository.IComentarioRepository;
import com.example.sistema_comentarios.service.IComentarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements IComentarioService<ComentarioEntity> {
    private final IComentarioRepository comentarioRepository;

    public ComentarioServiceImpl(IComentarioRepository comentarioRepository) {
        this.comentarioRepository = comentarioRepository;
    }

    @Override
    public ComentarioEntity avaliar(ComentarioEntity comentarioEntity) {
        if(comentarioEntity != null)
        {
            return (ComentarioEntity) comentarioRepository.save(comentarioEntity);
        }
        return new ComentarioEntity();
    }

    @Override
    public List<ComentarioEntity> mostrarAvaliacoes() {
        return comentarioRepository.findAll();
    }
}
