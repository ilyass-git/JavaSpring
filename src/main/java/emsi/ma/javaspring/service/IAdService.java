package emsi.ma.javaspring.service;

import emsi.ma.javaspring.domain.entity.ANNONCES.Ad;
import emsi.ma.javaspring.domain.entity.ANNONCES.AdStatus;

import java.util.List;
import java.util.Optional;

public interface IAdService {
    Ad create(Ad ad);

    Optional<Ad> getById(Long id);

    List<Ad> getAllPublished();

    List<Ad> getByOwnerId(Long ownerId);

    List<Ad> getByPropertyId(Long propertyId);

    List<Ad> searchByTitle(String keyword);

    Ad updateStatus(Long id, AdStatus status);

    void delete(Long id);
}
