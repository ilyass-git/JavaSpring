package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.ANNONCES.PropertyDto;
import emsi.ma.javaspring.domain.entity.ANNONCES.Property;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PropertyMapper {
    Property toEntity(PropertyDto propertyDto);

    PropertyDto toDto(Property property);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Property partialUpdate(PropertyDto propertyDto, @MappingTarget Property property);
}