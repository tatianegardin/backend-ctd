package com.dh.backend.teste.utils;

import com.dh.backend.model.Serie;

import java.util.ArrayList;
import java.util.List;

public class TesteUtil {

    public static Serie  newSerie(){
        return new Serie("A volta das batatas");
    }


    public static List<Serie> serieList(){
        List<Serie>serieList = new ArrayList<>();
        serieList.add(new Serie("batata1"));
        serieList.add(new Serie("batata2"));
        serieList.add(new Serie("batata3"));
        serieList.add(new Serie("batata4"));
        serieList.add(new Serie("batata5"));

        return serieList;
    }
}
