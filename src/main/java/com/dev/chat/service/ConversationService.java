package com.dev.chat.service;

import java.util.Optional;
import java.util.UUID;

import com.dev.chat.model.Conversation;

public interface ConversationService {
    Optional<Conversation> getConversationById(UUID conversationId);
    void addUserToConversation(UUID conversationId, UUID userId);
    void removeUserFromConversation(UUID conversationId, UUID userId);
    void updateParticipantRole(UUID conversationId, UUID userId, String role);
}
