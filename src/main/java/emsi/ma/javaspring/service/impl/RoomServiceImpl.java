package emsi.ma.javaspring.service.impl;
import emsi.ma.javaspring.domain.entity.ANNONCES.Room;
import emsi.ma.javaspring.repository.RoomRepository;
import emsi.ma.javaspring.service.IRoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


    @Service
    @RequiredArgsConstructor
public class RoomServiceImpl implements IRoomService {

        private final RoomRepository roomRepository;

        @Override
        public Room create(Room room) {
            return roomRepository.save(room);
        }

        @Override
        public Optional<Room> getById(Long id) {
            return roomRepository.findById(id);
        }

        @Override
        public List<Room> getByPropertyId(Long propertyId) {
            return roomRepository.findByPropertyId(propertyId);
        }

        @Override
        public List<Room> getAvailableRooms() {
            return roomRepository.findByIsAvailableTrue();
        }

        @Override
        public List<Room> getByPriceLessThan(BigDecimal maxPrice) {
            return roomRepository.findByPriceLessThan(maxPrice);
        }

        @Override
        public Room update(Long id, Room room) {
            room.setId(id);
            return roomRepository.save(room);
        }

        @Override
        public void delete(Long id) {
            roomRepository.deleteById(id);
        }
}
