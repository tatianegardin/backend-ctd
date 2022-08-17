package com.dh.backend.service;

import com.dh.backend.dao.impl.PacienteDao;
import com.dh.backend.model.Paciente;


import java.util.List;

public class PacienteService {
    PacienteDao pacienteDao;

    public PacienteService() {
        this.pacienteDao = new PacienteDao();
    }

    public Paciente savePaciente(Paciente materia){
        return pacienteDao.save(materia);
    }


    public List<Paciente> findAllPaciente(){
        return pacienteDao.findAll();
    }
}
