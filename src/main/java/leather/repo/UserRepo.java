package leather.repo;

import org.springframework.data.repository.CrudRepository;
import leather.entity.Users;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepo extends CrudRepository<Users, Integer> {

}