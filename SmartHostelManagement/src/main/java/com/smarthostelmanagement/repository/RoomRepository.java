package com.smarthostelmanagement.repository;

import com.smarthostelmanagement.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
    // Add custom query methods here if needed
}
