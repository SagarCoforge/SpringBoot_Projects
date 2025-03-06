package com.online.BagsStore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.BagsStore.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
Optional<User> findByEmail(String emial);
}
