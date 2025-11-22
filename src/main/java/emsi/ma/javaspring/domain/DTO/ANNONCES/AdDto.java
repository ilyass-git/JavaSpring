package emsi.ma.javaspring.domain.DTO.ANNONCES;

import emsi.ma.javaspring.domain.entity.ANNONCES.AdStatus;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.ANNONCES.Ad}
 */
@Value
public class AdDto implements Serializable {
    Long id;
    Long propertyId;
    Long roomId;
    String title;
    String description;
    List<String> photoUrls;
    Long ownerId;
    AdStatus status;
}