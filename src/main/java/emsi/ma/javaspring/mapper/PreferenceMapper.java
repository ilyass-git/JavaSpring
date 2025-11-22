package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.UTILISATEURS.PreferenceDto;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.Preference;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface PreferenceMapper {
    Preference toEntity(PreferenceDto preferenceDto);

    PreferenceDto toDto(Preference preference);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Preference partialUpdate(PreferenceDto preferenceDto, @MappingTarget Preference preference);
}