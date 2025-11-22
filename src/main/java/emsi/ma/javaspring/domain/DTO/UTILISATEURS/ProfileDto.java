package emsi.ma.javaspring.domain.DTO.UTILISATEURS;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.UTILISATEURS.Profile}
 */
@Value
public class ProfileDto implements Serializable {
    Long userId;
    String bio;
    Integer age;
    String avatarUrl;
}