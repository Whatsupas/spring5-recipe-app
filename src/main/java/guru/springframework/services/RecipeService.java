package guru.springframework.services;
import guru.springframework.domain.Recipe;
import java.util.Set;

/**
 * Created by Robertas Tutlys on 2020-04-22
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
