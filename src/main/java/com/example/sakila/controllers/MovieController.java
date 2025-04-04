package com.example.sakila.controllers;

import com.example.sakila.entities.Movie;
import com.example.sakila.services.MovieService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
