package com.dev.chat.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.chat.model.ReadReceipt;

public interface ReadReceiptRepository extends JpaRepository<ReadReceipt, UUID>{
    List<ReadReceipt> findByMessageId(UUID messageId);
    Optional<ReadReceipt> findByUserIdAndMessageId(UUID userId, UUID messageId);
}
