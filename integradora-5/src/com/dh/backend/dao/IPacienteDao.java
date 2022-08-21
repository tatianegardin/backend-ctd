package com.dh.backend.dao;

import com.dh.backend.model.Paciente;

import java.util.List;

public interface IPacienteDao<T> {
    T save(T t);
    List<T> findAll();
    void deleteById(int id);
    Paciente findById(int id);
}
