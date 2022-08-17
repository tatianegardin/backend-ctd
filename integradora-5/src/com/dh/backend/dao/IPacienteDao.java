package com.dh.backend.dao;

import java.util.List;

public interface IPacienteDao<T> {
    T save(T t);
    List<T> findAll();
}
