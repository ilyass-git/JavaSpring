package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.UTILISATEURS.UserResponseDto;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.User;
import emsi.ma.javaspring.domain.entity.UTILISATEURS.UserCreateDto;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    // Création : DTO → Entity
    @Mapping(target = "id", ignore = true)
    User toEntity(UserCreateDto userCreateDto);

    // Lecture : Entity → DTO (SANS password)
    UserResponseDto toResponseDto(User user);

    // Mise à jour partielle
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(UserResponseDto dto, @MappingTarget User user);
}