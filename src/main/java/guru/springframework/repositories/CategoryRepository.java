package guru.springframework.repositories;

import guru.springframework.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Robertas Tutlys on 2020-04-21
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
