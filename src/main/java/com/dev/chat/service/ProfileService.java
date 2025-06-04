package com.dev.chat.service;

import java.util.List;
import java.util.UUID;

import com.dev.chat.model.Profile;

public interface ProfileService {
    Profile getProfileById(UUID id);
    List<Profile> searchProfiles(String keyword);
    Profile createProfile(Profile profile);
    Profile updateProfile(UUID id, Profile profile);
    void deleteProfile(UUID id);
}
