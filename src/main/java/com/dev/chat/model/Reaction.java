package com.dev.chat.model;

import java.time.Instant;
import java.util.UUID;
import org.hibernate.annotations.CreationTimestamp;p
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reaction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Message message;
    private User user;
    private String emoji;
    @CreationTimestamp
    private Instant reactedAt;
}
