package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.LiveAnnouncement;

public interface LiveAnnouncementRepository extends JpaRepository<LiveAnnouncement, UUID> {
}