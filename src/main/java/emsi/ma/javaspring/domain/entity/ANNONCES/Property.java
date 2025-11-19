package emsi.ma.javaspring.domain.entity.ANNONCES;
import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "properties")
public class Property {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String address;
    private String city;

    @Column(length = 2000)
    private String description;

    private Long ownerId; // référence User service
}
