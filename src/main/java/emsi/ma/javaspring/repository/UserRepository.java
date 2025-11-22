package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    List<User> findByNomContainingIgnoreCase(String nom);

}