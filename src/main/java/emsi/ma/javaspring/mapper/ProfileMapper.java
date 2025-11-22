package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.UTILISATEURS.ProfileDto;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.Profile;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfileMapper {
    Profile toEntity(ProfileDto profileDto);

    ProfileDto toDto(Profile profile);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Profile partialUpdate(ProfileDto profileDto, @MappingTarget Profile profile);
}