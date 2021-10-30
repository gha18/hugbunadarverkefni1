package project.service;

import main.java.project.persistence.entities.Recipe;
import project.persistence.entities.Tags;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    Recipe findOne(long id);
    List<Recipe> findByName(String name);
    List<Recipe> findByTags(Tags tags);
    void sendRecipe(long id, String email);
}