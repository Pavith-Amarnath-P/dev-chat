package com.dev.chat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.chat.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, UUID>{
    List<Participant> findByUserId(UUID userId);
    Optional<Participant> findByUserIdAndConversationId(UUID userId, UUID conversationId);
}
