package project.persistence.repositories;
import main.java.project.persistence.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import project.persistence.entities.Tags;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();
    Recipe findOne(long id);
    List<Recipe> findByName(String name);
    List<Recipe> findByTags(Tags tags);
    void sendRecipe(long id, String email);
}