package usa.edu.co.Ciclo4R1.repository.crud;

import usa.edu.co.Ciclo4R1.model.User;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

/**
 *
 * @author Anyela León
 */
public interface UserCrudRepository extends CrudRepository<User,Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email, String password);
    //Optional<User> findByName(String name);
}

