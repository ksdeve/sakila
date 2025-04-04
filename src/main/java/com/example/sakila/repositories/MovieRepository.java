package com.example.sakila.repositories;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // Méthode pour rechercher un film par une partie du titre
    List<Movie> findByTitleContainingIgnoreCase(String title);

    // Recherche d'acteurs par ID de film
    @Query("SELECT m.actors FROM Movie m WHERE m.filmId = :movieId")
    Set<Actor> findActorsByMovieId(@Param("movieId") Integer movieId);


}
