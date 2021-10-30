package main.java.project.controller;

import project.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RecipeController
{
    RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService)
    {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public String recipeGetDescriptionFromName(@PathVariable String name, Model model)
    {
        model.addAttribute("recipes", recipeService.findByName(name));
        model.addAttribute("recipe",new Recipe());
        return "recipes/Recipes";
    }

    @RequestMapping(value = "/recipe", method = RequestMethod.Post)
    public String recipeViewGet(Model model)
    {
        model.addAttribute("recipe", new Recipe());
        model.addAttribute("recipes", recipeService.findAll());
        return "recipes/Recipes";
    }

    @RequestMapping(value = "/recipe", method = RequestMethod.Post)
    public void sendRecipe(long id, String email)
    {
        //Ekki hugmynd
    }

}

