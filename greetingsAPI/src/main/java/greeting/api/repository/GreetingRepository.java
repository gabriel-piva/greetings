package greeting.api.repository;

import greeting.api.entity.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Integer> {
    Greeting findById(int id);
}
