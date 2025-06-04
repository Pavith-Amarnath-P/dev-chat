package com.dev.chat.model;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "participants")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private User user;
    private Conversation conversation;
    private ERole role;
    private Boolean isMuted;
    private Instant mutedUntil;
    @CreationTimestamp
    private Instant joinedAt;
}
