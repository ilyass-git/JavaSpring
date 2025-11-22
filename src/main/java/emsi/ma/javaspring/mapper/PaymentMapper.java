package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.CONTRATS.PaymentDto;
import emsi.ma.javaspring.domain.entity.CONTRATS.Payment;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PaymentMapper {
    Payment toEntity(PaymentDto paymentDto);

    PaymentDto toDto(Payment payment);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Payment partialUpdate(PaymentDto paymentDto, @MappingTarget Payment payment);
}