package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}