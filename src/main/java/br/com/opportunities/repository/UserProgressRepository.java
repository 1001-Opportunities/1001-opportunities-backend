package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.UserProgress;

public interface UserProgressRepository extends JpaRepository<UserProgress, UUID> {
}