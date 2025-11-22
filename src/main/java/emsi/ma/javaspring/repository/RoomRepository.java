package emsi.ma.javaspring.repository;

import emsi.ma.javaspring.domain.entity.ANNONCES.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findByPropertyId(Long propertyId);

    List<Room> findByIsAvailableTrue();

    List<Room> findByPriceLessThan(BigDecimal price);

    List<Room> findByPropertyIdAndIsAvailableTrue(Long propertyId);

}