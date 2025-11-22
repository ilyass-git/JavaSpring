package emsi.ma.javaspring.domain.DTO.UTILISATEURS;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.UTILISATEURS.User}
 */
@Value
public class UserResponseDto implements Serializable {
    Long id;
    String email;
    String nom;
    String prenom;
    String telephone;
}