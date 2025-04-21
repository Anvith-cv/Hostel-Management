package com.smarthostelmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "booking_requests")
public class BookingRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "student_id", nullable = false)
    private long studentId;

    @Column(name = "requested_room_id", nullable = false)
    private long requestedRoomId;

    @Column(name = "status", nullable = false)
    private String status;

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public long getStudentId() { return studentId; }
    public void setStudentId(long studentId) { this.studentId = studentId; }

    public long getRequestedRoomId() { return requestedRoomId; }
    public void setRequestedRoomId(long requestedRoomId) { this.requestedRoomId = requestedRoomId; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
