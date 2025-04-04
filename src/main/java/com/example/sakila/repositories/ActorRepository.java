package com.example.sakila.repositories;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    List<Actor> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String first, String last);

    // Recherche de films par ID d'acteur
    @Query("SELECT a.movies FROM Actor a WHERE a.id = :actorId")
    List<Movie> findMoviesByActorId(@Param("actorId") Integer actorId);

}