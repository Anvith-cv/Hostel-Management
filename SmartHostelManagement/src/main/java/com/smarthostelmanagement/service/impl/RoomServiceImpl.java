package com.smarthostelmanagement.service.impl;

import com.smarthostelmanagement.model.Room;
import com.smarthostelmanagement.repository.RoomRepository;
import com.smarthostelmanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room update(Long id, Room updatedRoom) {
        Room existingRoom = roomRepository.findById(id).orElse(null);
        if (existingRoom != null) {
            existingRoom.setRoomNumber(updatedRoom.getRoomNumber());
            existingRoom.setCapacity(updatedRoom.getCapacity());
            existingRoom.setStatus(updatedRoom.getStatus());
            // Update other fields as per the model
            return roomRepository.save(existingRoom);
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room getById(Long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        roomRepository.deleteById(id);
    }
}
