package emsi.ma.javaspring.domain.DTO.CONTRATS;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link emsi.ma.javaspring.domain.entity.CONTRATS.Tenant}
 */
@Value
public class TenantDto implements Serializable {
    Long id;
    Long contractId;
    Long userId;
    Long roomId;
}