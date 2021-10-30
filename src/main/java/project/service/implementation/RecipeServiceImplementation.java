package main.java.project.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
//import main.java.project.service;
import org.springframework.stereotype.Service;
import main.java.project.service.RecipeService;
import main.java.project.persistence.entities.Recipe;
import project.persistence.entities.Tags;
import project.persistence.repositories.RecipeRepository;

import java.util.List;

@Service

public class RecipeServiceImplementation implements RecipeService {
    RecipeRepository repository;

    @Autowired
    public RecipeServiceImplementation(RecipeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Recipe> findAll() {
        return repository.findAll();
    }

    @Override
    public Recipe findOne(long id) {
        return repository.findOne(id);
    }

    @Override 
    public List<Recipe> findByName(String name) {
        return repository.findByName(name);
    }

    @Override 
    public List<Recipe> findByTags(Tags tags) {
        return repository.findByTags(tags); 
    }

    @Override
    public void sendRecipe(long id, String email) {
        repository.sendRecipe(id, email); 
    }
}

