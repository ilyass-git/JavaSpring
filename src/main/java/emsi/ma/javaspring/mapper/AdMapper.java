package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.ANNONCES.AdDto;
import emsi.ma.javaspring.domain.entity.ANNONCES.Ad;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AdMapper {
    Ad toEntity(AdDto adDto);

    AdDto toDto(Ad ad);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Ad partialUpdate(AdDto adDto, @MappingTarget Ad ad);
}