package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.ANNONCES.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
}