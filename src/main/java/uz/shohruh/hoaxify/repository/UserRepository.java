package uz.shohruh.hoaxify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shohruh.hoaxify.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndDisplayName(String username, String displayName);
    User findByUsername(String username);
}
