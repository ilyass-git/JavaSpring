package emsi.ma.javaspring.domain.DTO.ANNONCES;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.ANNONCES.Property}
 */
@Value
public class PropertyDto implements Serializable {
    Long id;
    String title;
    String address;
    String city;
    String description;
    Long ownerId;
}