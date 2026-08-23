package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.FeaturedJob;

public interface FeaturedJobRepository extends JpaRepository<FeaturedJob, UUID> {
}