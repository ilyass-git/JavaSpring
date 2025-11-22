package emsi.ma.javaspring.domain.DTO.CONTRATS;

import emsi.ma.javaspring.domain.entity.CONTRATS.ContractStatus;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.CONTRATS.Contract}
 */
@Value
public class ContractDto implements Serializable {
    Long id;
    Long propertyId;
    LocalDate startDate;
    LocalDate endDate;
    ContractStatus status;
}