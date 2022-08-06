package com.dh.backend.service;

import com.dh.backend.model.Serie;

import java.util.ArrayList;
import java.util.List;

public class GradeSeries implements IGradeSerie {
    List<Serie> serieList = new ArrayList<>();
    @Override
    public String getSerie(String serie) {
        Serie serieFiltrada =  serieList.stream().filter(s -> s.getNome().equals(serie)).findFirst().get();
        return "www." + serieFiltrada.getNome().replace(" ", "").toLowerCase()+ ".com";
    }

    @Override
    public Serie addSerie(Serie serie) {
        serieList.add(serie);
        return serie;
    }
}
