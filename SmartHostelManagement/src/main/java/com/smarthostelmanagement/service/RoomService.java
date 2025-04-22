package com.smarthostelmanagement.service;

import com.smarthostelmanagement.model.Room;
import java.util.List;

public interface RoomService {
    Room save(Room room);  // Method to save room
    Room update(Long id, Room room);  // Method to update room
    List<Room> getAll();  // Method to get all rooms
    Room getById(Long id);  // Method to get room by id
    void delete(Long id);  // Method to delete room
}
