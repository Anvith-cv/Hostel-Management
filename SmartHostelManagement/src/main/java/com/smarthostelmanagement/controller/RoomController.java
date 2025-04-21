package com.smarthostelmanagement.controller;

import com.smarthostelmanagement.model.Room;
import com.smarthostelmanagement.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    public List<Room> getAll() {
        return roomService.getAll();
    }

    @GetMapping("/{id}")
    public Room getById(@PathVariable Long id) {
        return roomService.getById(id);
    }

    @PostMapping
    public Room create(@RequestBody Room room) {
        return roomService.create(room);
    }

    @PutMapping("/{id}")
    public Room update(@PathVariable Long id, @RequestBody Room room) {
        return roomService.update(id, room);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        roomService.delete(id);
    }
}
