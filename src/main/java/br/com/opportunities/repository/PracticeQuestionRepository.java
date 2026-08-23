package br.com.opportunities.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.PracticeQuestion;

public interface PracticeQuestionRepository extends JpaRepository<PracticeQuestion, UUID> {
}