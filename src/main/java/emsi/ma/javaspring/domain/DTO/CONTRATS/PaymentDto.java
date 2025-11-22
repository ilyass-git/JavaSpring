package emsi.ma.javaspring.domain.DTO.CONTRATS;

import emsi.ma.javaspring.domain.entity.CONTRATS.PaymentType;
import lombok.Value;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.CONTRATS.Payment}
 */
@Value
public class PaymentDto implements Serializable {
    Long id;
    Long contractId;
    BigDecimal amount;
    LocalDate dueDate;
    PaymentType type;
}