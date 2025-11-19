package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}