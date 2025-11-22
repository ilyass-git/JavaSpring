package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.CONTRATS.ContractDto;
import emsi.ma.javaspring.domain.entity.CONTRATS.Contract;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ContractMapper {
    Contract toEntity(ContractDto contractDto);

    ContractDto toDto(Contract contract);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Contract partialUpdate(ContractDto contractDto, @MappingTarget Contract contract);
}