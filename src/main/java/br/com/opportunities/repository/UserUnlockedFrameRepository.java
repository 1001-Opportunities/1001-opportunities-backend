package br.com.opportunities.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.opportunities.model.UserUnlockedFrame;
import br.com.opportunities.model.UserUnlockedFrameId;

public interface UserUnlockedFrameRepository
        extends JpaRepository<UserUnlockedFrame, UserUnlockedFrameId> {
}