package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Robertas Tutlys on 2020-04-21
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
