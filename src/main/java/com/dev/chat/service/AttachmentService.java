package com.dev.chat.service;

import java.util.Optional;
import java.util.UUID;

import com.dev.chat.model.Attachment;

public interface AttachmentService {
    Optional<Attachment> getAttachmentById(UUID id);
    Attachment createAttachment(Attachment attachment);
    void deleteAttachment(UUID id);
}
