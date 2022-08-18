package com.dh.backend.testes;

import com.dh.backend.dao.Impl.FilialDao;
import com.dh.backend.model.Filial;

public class TesteFilialUtil {

    public static Filial newFilial1(){
        return new Filial("Filial 1", "rua", "1", "Cidade 1", "Estado 1", true);
    }
    public static Filial newFilial2(){
        return new Filial("Filial 2", "rua", "2", "Cidade 2", "Estado 2", false);
    }
    public static Filial newFilial3(){
        return new Filial("Filial 3", "rua", "3", "Cidade 3", "Estado 3", true);
    }
    public static Filial newFilial4(){
        return new Filial("Filial 4", "rua", "4", "Cidade 4", "Estado 4", false);
    }
    public static Filial newFilial5(){
        return new Filial("Filial 5", "rua", "5", "Cidade 5", "Estado 5", true);
    }

}
