package com.dev.chat.model;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "read_receipts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadReceipt {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private User user;
    private Message message;
    private Instant seenAt;
}
