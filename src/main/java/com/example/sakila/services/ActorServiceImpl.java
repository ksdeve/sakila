package com.example.sakila.services;

import com.example.sakila.entities.Actor;
import com.example.sakila.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository repository;

    public ActorServiceImpl(ActorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Actor> findByExpression(String expression) {
        return repository.findByActorContainingIgnoreCase(expression);
    }

    @Override
    public Actor create(Actor actor) {
        return null;
    }

    @Override
    public Actor read(Integer id) {
        return null;
    }

    @Override
    public Actor update(Actor actor) {
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<Actor> readAll() {
        return repository.findAll();
    }
}
