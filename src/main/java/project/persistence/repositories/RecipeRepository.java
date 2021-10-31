package project.persistence.repositories;
import project.persistence.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import project.persistence.entities.Tags;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();

    Recipe findOne(long id);

    List<Recipe> findByName(String name);

    //@Query(value = "SELECT p FROM Recipe p WHERE p.tags = ?1 AND p.serves = ?2 AND p.price >= ?3 AND p.price <= ?4 AND p.category = ?5")
    List<Recipe> findByTags(int tagId, int serves, int priceLow, int priceHigh, int category);

    void sendRecipe(long id, String email);
}