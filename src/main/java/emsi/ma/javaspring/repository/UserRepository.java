package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}