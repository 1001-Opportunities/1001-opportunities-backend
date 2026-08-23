package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.Resume;

public interface ResumeRepository extends JpaRepository<Resume, UUID> {
}