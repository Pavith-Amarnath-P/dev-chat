package com.dev.chat.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.dev.chat.model.Message;

public interface MessageService {
    Message sendMessage(Message message);
    List<Message> getMessagesForConversation(UUID conversationId);
    Message editMessage(UUID messageId, Message message);
    void deleteMessage(UUID messageId);
    Optional<Message> getMessageById(UUID messageId);
}
