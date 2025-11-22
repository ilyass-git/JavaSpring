package emsi.ma.javaspring.domain.DTO.UTILISATEURS;

import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference}
 */
@Value
public class PreferenceDto implements Serializable {
    Long userId;
    BigDecimal budget;
    String city;
    Boolean smokingAllowed;
}