package com.dev.chat.repository;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dev.chat.model.Profile;

public interface ProfileRepository extends JpaRepository<Profile, UUID>{
    Optional<Profile> findByUsername(String username);
}
