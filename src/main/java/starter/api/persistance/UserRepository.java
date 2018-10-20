package starter.api.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import starter.api.entity.User;

import java.math.BigInteger;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, BigInteger> {
    Optional<User> findByEmail(String email);
}
