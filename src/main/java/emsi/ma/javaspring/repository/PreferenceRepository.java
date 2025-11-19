package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepository extends JpaRepository<Preference, Long> {
}