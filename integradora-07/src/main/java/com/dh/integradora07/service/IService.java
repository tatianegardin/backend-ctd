package com.dh.integradora07.service;

import java.util.List;

public interface IService<T> {
    T save(T t);
    List<T> getAll();
    String deleteById(int id);
    T getById(int id);
}
