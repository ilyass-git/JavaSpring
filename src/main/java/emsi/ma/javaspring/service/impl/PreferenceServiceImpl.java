package emsi.ma.javaspring.service.impl;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference;
import emsi.ma.javaspring.repository.PreferenceRepository;
import emsi.ma.javaspring.service.IPreferenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PreferenceServiceImpl implements IPreferenceService {

    private final PreferenceRepository preferenceRepository;

    @Override
    public Preference create(Preference preference) {
        return preferenceRepository.save(preference);
    }

    @Override
    public Optional<Preference> getByUserId(Long userId) {
        return preferenceRepository.findByUserId(userId);
    }

    @Override
    public List<Preference> findByCity(String city) {
        return preferenceRepository.findByCity(city);
    }

    @Override
    public List<Preference> findByBudgetLessThan(BigDecimal budget) {
        return preferenceRepository.findByBudgetLessThan(budget);
    }

    @Override
    public Preference update(Long userId, Preference preference) {
        Preference existing = preferenceRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Preference not found"));
        preference.setId(existing.getId());
        preference.setUserId(userId);
        return preferenceRepository.save(preference);
    }
}
