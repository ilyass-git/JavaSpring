package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.ANNONCES.Property;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByCity(String city);

    List<Property> findByOwnerId(Long ownerId);

    List<Property> findByCityAndTitleContaining(String city, String keyword);

}
