package com.dh.backend.teste;

import com.dh.backend.exception.SerieNaoHabilitadaException;
import com.dh.backend.model.Serie;
import com.dh.backend.service.GradeSerieProxy;
import com.dh.backend.service.GradeSeries;
import com.dh.backend.service.IGradeSerie;
import com.dh.backend.teste.utils.TesteUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeSeriesTest{

    @Test
    void addSerie() {
        //prepara
        Serie newSerie = TesteUtil.newSerie();
        GradeSeries gradeSeries =  new GradeSeries();

        //executa
        Serie serieSalva = gradeSeries.addSerie(newSerie);

        //verifica
        assertEquals(newSerie.getNome(), serieSalva.getNome());
    }

}