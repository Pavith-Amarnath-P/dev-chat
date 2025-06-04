package com.dev.chat.service;

import java.util.List;
import java.util.UUID;

import com.dev.chat.model.User;

public interface PresenceService {
    void markUserOnline(UUID userId);
    void markUserOffline(UUID userId);
    boolean isUserOnline(UUID userId);
    List<User> getOnlineUsersInConversation(UUID conversationId);
}
