package project.service;

import project.persistence.entities.Recipe;
import project.persistence.entities.Tags;

import java.util.List;

public interface RecipeService {
    List<Recipe> findAll();
    //Recipe findOne(long id);
    List<Recipe> findByName(String name);
    //List<Recipe> findByTags(int tagId, int serves, int priceLow, int priceHigh, int category);
    //void sendRecipe(long id, String email);*/
}