package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.PracticeProgress;

public interface PracticeProgressRepository extends JpaRepository<PracticeProgress, UUID> {
}