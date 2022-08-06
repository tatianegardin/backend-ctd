package com.dh.backend.service;

import com.dh.backend.exception.SerieNaoHabilitadaException;
import com.dh.backend.model.Serie;

public interface IGradeSerie {
    String getSerie (String serie) throws SerieNaoHabilitadaException;
    Serie addSerie(Serie serie);
}
