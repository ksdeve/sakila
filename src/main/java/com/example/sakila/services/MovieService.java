package com.example.sakila.services;

import com.example.sakila.entities.Movie;
import java.util.List;

public interface MovieService extends CrudService<Movie, Integer> {


    // Méthode pour rechercher un film par titre partiel
    List<Movie> searchMoviesByTitle(String title);


}
