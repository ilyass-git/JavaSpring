package emsi.ma.javaspring.service.impl;

import emsi.ma.javaspring.domain.entity.ANNONCES.Ad;
import emsi.ma.javaspring.domain.entity.ANNONCES.AdStatus;
import emsi.ma.javaspring.repository.AdRepository;
import emsi.ma.javaspring.service.IAdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdServiceImpl implements IAdService {

    private final AdRepository adRepository;

    @Override
    public Ad create(Ad ad) {
        return adRepository.save(ad);
    }

    @Override
    public Optional<Ad> getById(Long id) {
        return adRepository.findById(id);
    }

    @Override
    public List<Ad> getAllPublished() {
        return adRepository.findByStatus(AdStatus.PUBLISHED);
    }

    @Override
    public List<Ad> getByOwnerId(Long ownerId) {
        return adRepository.findByOwnerId(ownerId);
    }

    @Override
    public List<Ad> getByPropertyId(Long propertyId) {
        return adRepository.findByPropertyId(propertyId);
    }

    @Override
    public List<Ad> searchByTitle(String keyword) {
        return adRepository.findByTitleContainingIgnoreCase(keyword);
    }

    @Override
    public Ad updateStatus(Long id, AdStatus status) {
        Ad ad = adRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ad not found"));
        ad.setStatus(status);
        return adRepository.save(ad);
    }

    @Override
    public void delete(Long id) {
        adRepository.deleteById(id);
    }
}
