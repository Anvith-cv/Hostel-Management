package com.smarthostelmanagement.model;

import jakarta.persistence.*;

@Entity
@Table(name = "complaints")
public class Complaints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @Column(name = "issue", nullable = false)
    private String issue;

    @Column(name = "status", nullable = false)
    private String status;

    // Getters and Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public String getIssue() { return issue; }
    public void setIssue(String issue) { this.issue = issue; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
