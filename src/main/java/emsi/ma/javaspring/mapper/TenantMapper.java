package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.CONTRATS.TenantDto;
import emsi.ma.javaspring.domain.entity.CONTRATS.Tenant;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TenantMapper {
    Tenant toEntity(TenantDto tenantDto);

    TenantDto toDto(Tenant tenant);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Tenant partialUpdate(TenantDto tenantDto, @MappingTarget Tenant tenant);
}