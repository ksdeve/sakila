package com.example.sakila.services;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;
import java.util.List;
import java.util.Set;

public interface MovieService extends CrudService<Movie, Integer> {


    // Méthode pour rechercher un film par titre partiel
    List<Movie> searchMoviesByTitle(String title);

    Set<Actor> getActorsByMovieId(Integer movieId);

}
