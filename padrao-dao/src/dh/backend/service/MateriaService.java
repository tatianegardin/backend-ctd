package dh.backend.service;

import dh.backend.dao.impl.MateriaDao;
import dh.backend.model.Materia;

import java.util.List;

public class MateriaService {
    MateriaDao materiaDao;

    public MateriaService() {
        this.materiaDao = new MateriaDao();
    }

    public Materia saveMateria(Materia materia){
        return materiaDao.save(materia);
    }


    public List<Materia> findAllMateriaa(){
        return materiaDao.findAll();
    }
}
