package emsi.ma.javaspring.service.impl;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.Profile;
import emsi.ma.javaspring.repository.ProfileRepository;
import emsi.ma.javaspring.service.IProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements IProfileService {

    private final ProfileRepository profileRepository;

    @Override
    public Profile create(Profile profile) {
        return profileRepository.save(profile);
    }

    @Override
    public Optional<Profile> getByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }

    @Override
    public Profile update(Long userId, Profile profile) {
        Profile existing = profileRepository.findByUserId(userId)
                .orElseThrow(() -> new RuntimeException("Profile not found"));
        profile.setId(existing.getId());
        profile.setUserId(userId);
        return profileRepository.save(profile);
    }
}
