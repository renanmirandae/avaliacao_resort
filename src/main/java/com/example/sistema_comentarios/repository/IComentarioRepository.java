package com.example.sistema_comentarios.repository;

import com.example.sistema_comentarios.entity.ComentarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComentarioRepository extends JpaRepository <ComentarioEntity, Integer> {
}
