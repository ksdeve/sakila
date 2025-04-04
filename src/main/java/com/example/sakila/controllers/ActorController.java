package com.example.sakila.controllers;

import com.example.sakila.entities.Actor;
import com.example.sakila.entities.Movie;
import com.example.sakila.services.ActorService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    private final ActorService service;

    public ActorController(ActorService service) {
        this.service = service;
    }

    @GetMapping
    @Transactional
    public List<Actor> readAll() {
        return service.readAll();
    }


    @GetMapping("/{id}/movies")
    public List<Movie> getActorMovies(@PathVariable Integer id) {
        return service.getMoviesByActorId(id);
    }

    @GetMapping("/search")
    @Transactional
    public List<Actor> searchCity(String name) {
        return service.findByExpression(name);
    }
}
