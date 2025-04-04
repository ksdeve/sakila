package com.example.sakila.controllers;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;
import com.example.sakila.services.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/movie")
public class MovieController
{
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping({"", "/all"})
    @Transactional
    public List<Movie> getAllMovies() {
        return service.readAll();
    }



    @GetMapping("/{id}/actors")
    public Set<Actor> getMovieActors(@PathVariable Integer id) {
        return service.getActorsByMovieId(id);
    }
    // Endpoint pour rechercher un film par titre
    @GetMapping("/search")
    @Transactional
    public List<Movie> searchMoviesByTitle(@RequestParam String title) {
        return service.searchMoviesByTitle(title);
    }
}
