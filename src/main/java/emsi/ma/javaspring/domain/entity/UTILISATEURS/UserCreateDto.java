package emsi.ma.javaspring.domain.entity.UTILISATEURS;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Value
public class UserCreateDto implements Serializable {
    @Email
    @NotBlank
    String email;
    String password;
    @NotBlank
    String nom;
    @NotBlank
    String prenom;
    @NotBlank
    String telephone;
}