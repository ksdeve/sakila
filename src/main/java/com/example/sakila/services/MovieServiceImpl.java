package com.example.sakila.services;

import com.example.sakila.entities.Movie;
import com.example.sakila.repositories.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl  implements MovieService {
    private static final Logger log = LoggerFactory.getLogger(MovieService.class);
    private final MovieRepository repository;

    public MovieServiceImpl(MovieRepository repository) {this.repository = repository;}

    @Override
    public Movie create(Movie city) {
        return repository.save(city);
    }

    @Override
    public Movie read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Movie update(Movie city) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Movie> readAll() {
        return repository.findAll();
    }



    // Implémentation pour rechercher des films par titre
    @Override
    public List<Movie> searchMoviesByTitle(String title) {
        return repository.findByTitleContainingIgnoreCase(title);
    }
}

