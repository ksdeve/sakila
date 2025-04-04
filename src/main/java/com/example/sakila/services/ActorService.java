package com.example.sakila.services;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;

import java.util.List;

public interface ActorService extends CrudService<Actor, Integer> {
    List<Actor> findByExpression(String keyword);
    List<Movie> getMoviesByActorId(Integer actorId);

}