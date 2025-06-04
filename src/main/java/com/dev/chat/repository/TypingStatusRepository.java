package com.dev.chat.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.chat.model.TypingStatus;

public interface TypingStatusRepository extends JpaRepository<TypingStatus, UUID>{
    Optional<TypingStatus> findByUserIdAndConversationId(UUID userId, UUID conversationId);
}
