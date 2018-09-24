package starter.api.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import starter.api.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

}
