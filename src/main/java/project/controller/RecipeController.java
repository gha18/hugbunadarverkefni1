package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import project.persistence.entities.Recipe;
import project.persistence.repositories.RecipeRepository;
import project.service.RecipeService;


@Controller

public class RecipeController
{
    RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/recipe/{name}", method = RequestMethod.POST)
    public String recipeGetRecipeFromName(@PathVariable String name, Model model)
    {
        model.addAttribute("recipes", recipeService.findByName(name));
        model.addAttribute("recipe",new Recipe());
        return "recipes/Recipes";
    }

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public String recipeViewGet(Model model)
    {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipes", recipeService.findAll());
        return "recipes/Recipes";
    }

    /*@RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public void sendRecipe(long id, String email)
    {
        //Ekki hugmynd
    }*/

}

