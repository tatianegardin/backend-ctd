package com.dh.backend.service;

import com.dh.backend.model.Filme;
import com.dh.backend.exception.FilmeNaoHabilitadoException;

public interface IGradeDeFilmes {
    public Filme getFilme(String nomeFilme) throws FilmeNaoHabilitadoException;

}
