package com.example.sistema_comentarios.service;

import java.util.List;

public interface IComentarioService <T>{
    public T avaliar(T t);
    public List<T> mostrarAvaliacoes();
}
