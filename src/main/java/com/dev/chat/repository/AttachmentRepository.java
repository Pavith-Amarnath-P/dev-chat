package com.dev.chat.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.chat.model.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID>{
    List<Attachment> findByMessageId(UUID messageId);
}
