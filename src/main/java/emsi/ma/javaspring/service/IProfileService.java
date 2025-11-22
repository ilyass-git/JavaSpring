package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.UTILISATEURS.Profile;

import java.util.Optional;

public interface IProfileService {
    Profile create(Profile profile);

    Optional<Profile> getByUserId(Long userId);

    Profile update(Long userId, Profile profile);
}
