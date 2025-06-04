package com.dev.chat.service;

import java.util.List;
import java.util.UUID;

import com.dev.chat.model.Reaction;

public interface ReactionService {
    Reaction reactToMessage(UUID messageId, UUID userId, String reactionType);
    void removeReaction(UUID messageId, UUID userId);
    List<Reaction> getReactionsForMessage(UUID messageID);
}
