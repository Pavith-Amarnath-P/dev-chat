package com.dev.chat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.chat.model.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation, UUID>{
    List<Conversation> findByParticipants(UUID userId);
    Optional<Conversation> findByIdAndIsDeletedFalse(UUID id);
}
