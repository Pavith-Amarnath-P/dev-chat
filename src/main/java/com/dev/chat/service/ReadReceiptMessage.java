package com.dev.chat.service;

import java.util.Optional;
import java.util.UUID;

import com.dev.chat.model.ReadReceipt;

public interface ReadReceiptMessage {
    void markMessageAsRead(UUID userId, UUID messageId);
    Optional<ReadReceipt> getReadReceipt(UUID messageId);
}
