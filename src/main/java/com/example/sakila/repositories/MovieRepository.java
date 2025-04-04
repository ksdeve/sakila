package com.example.sakila.repositories;

import com.example.sakila.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // Méthode pour rechercher un film par une partie du titre
    List<Movie> findByTitleContainingIgnoreCase(String title);


}
