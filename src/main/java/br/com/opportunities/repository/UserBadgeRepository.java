package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.UserBadge;

public interface UserBadgeRepository extends JpaRepository<UserBadge, UUID> {
}