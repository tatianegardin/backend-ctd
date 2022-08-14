package dh.backend.dao;

import dh.backend.model.Materia;

import java.util.List;

public interface IMateriaDao<T> {
    T save(T t);
    List<T> findAll();
}
