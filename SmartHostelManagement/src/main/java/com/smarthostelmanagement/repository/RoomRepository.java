package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
    // Custom query methods (if needed) can be added here
}
