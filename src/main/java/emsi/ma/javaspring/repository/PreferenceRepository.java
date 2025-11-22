package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface PreferenceRepository extends JpaRepository<Preference, Long> {
    Optional<Preference> findByUserId(Long userId);

    List<Preference> findByCity(String city);

    List<Preference> findByBudgetLessThan(BigDecimal budget);

}