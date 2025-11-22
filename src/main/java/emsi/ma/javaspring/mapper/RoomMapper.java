package emsi.ma.javaspring.mapper;

import emsi.ma.javaspring.domain.DTO.ANNONCES.RoomDto;
import emsi.ma.javaspring.domain.entity.ANNONCES.Room;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoomMapper {

    @Mapping(target = "id", ignore = true)
    Room toEntity(RoomDto roomDto);

    RoomDto toDto(Room room);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partialUpdate(RoomDto roomDto, @MappingTarget Room room);

}