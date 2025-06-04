package com.dev.chat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.chat.model.Reaction;

public interface ReactionRepository extends JpaRepository<Reaction, UUID>{
    List<Reaction> findByMessageId(UUID messageId);
    Optional<Reaction> findByMessageIdAndUserId(UUID messageId, UUID userId);
}
