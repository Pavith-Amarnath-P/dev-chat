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
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private User sernder;
    private Conversation conversation;
    private String text;
    private Instant sentAt;
    private Instant editedAt;
    private Boolean isDeleted;
    private Attachment attachment;
    private Reaction reactions;
    
}
