package com.dh.backend.service;

import com.dh.backend.dao.Impl.FilialDao;
import com.dh.backend.model.Filial;

public class FilialService {
    FilialDao filialDao;

    public FilialService() {
        this.filialDao = new FilialDao();
    }

    public Filial save(Filial filial){
        return filialDao.save(filial);
    }
}
