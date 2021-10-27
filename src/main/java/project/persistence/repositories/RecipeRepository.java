package main.java.project.persistence.repositories;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAll();
    Recipe findOne(long id);
    List<Recipe> findByName(String name);
    List<Recipe> findByTags(Tags tags);
    void sendRecipe(long id, String email);
}