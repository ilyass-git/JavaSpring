package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IPreferenceService {

    Preference create(Preference preference);

    Optional<Preference> getByUserId(Long userId);

    List<Preference> findByCity(String city);

    List<Preference> findByBudgetLessThan(BigDecimal budget);

    Preference update(Long userId, Preference preference);
}
