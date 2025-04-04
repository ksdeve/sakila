package com.example.sakila.services;

import java.util.List;

public interface CrudService<T, K> {
    T create(T t);
    T read(K id);
    T update(T t);
    boolean delete(K id);
    List<T> readAll();
}