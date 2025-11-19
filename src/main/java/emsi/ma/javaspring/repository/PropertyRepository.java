package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.ANNONCES.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}