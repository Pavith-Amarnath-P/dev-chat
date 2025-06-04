package com.dev.chat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.chat.model.Message;

public interface MessageRepository extends JpaRepository<Message, UUID>{
    List<Message> findByConversationIdOrderBySentAtAsc(UUID conversationId);
    Optional<Message> findTopByConversationIdOrderBySentAtDesc(UUID conversationId);
}
