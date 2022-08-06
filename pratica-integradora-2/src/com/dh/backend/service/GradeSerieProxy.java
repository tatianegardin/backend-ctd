package com.dh.backend.service;

import com.dh.backend.exception.SerieNaoHabilitadaException;
import com.dh.backend.model.Serie;

public class GradeSerieProxy implements IGradeSerie {
    private int qtdViews;
    GradeSeries gradeSerie;

    public GradeSerieProxy() {
        this.gradeSerie = new GradeSeries();
    }

    @Override
    public String getSerie(String serie) throws SerieNaoHabilitadaException {
       if(qtdViews < 6){
            qtdViews++;
            return gradeSerie.getSerie(serie);
       }
       throw new SerieNaoHabilitadaException("Você passou seu limite semanal!");
    }

    @Override
    public Serie addSerie(Serie serie) {
        gradeSerie.addSerie(serie);
        return serie;
    }

}
