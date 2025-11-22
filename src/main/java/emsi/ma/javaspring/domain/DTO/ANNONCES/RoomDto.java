package emsi.ma.javaspring.domain.DTO.ANNONCES;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.ANNONCES.Room}
 */
@Value
public class RoomDto implements Serializable {
    Long id;
    Long propertyId;
    String name;
    BigDecimal price;
    Boolean isAvailable;
}