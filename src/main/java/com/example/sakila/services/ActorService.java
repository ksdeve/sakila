package com.example.sakila.services;

import com.example.sakila.entities.Actor;

import java.util.List;

public interface ActorService extends CrudService<Actor, Integer> {
    List<Actor> findByExpression(String expression);
}
