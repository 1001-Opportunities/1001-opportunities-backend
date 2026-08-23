package br.com.opportunities.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_progress")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "user_id", nullable = false, unique = true)
    private UUID userId;

    @Column(name = "dashboard_visited")
    private Boolean dashboardVisited;

    @Column(name = "faq_visited")
    private Boolean faqVisited;

    @Column(name = "settings_visited")
    private Boolean settingsVisited;

    @Column(name = "jobs_visited")
    private Boolean jobsVisited;

    @Column(name = "courses_visited")
    private Boolean coursesVisited;

    @Column(name = "explorer_frame_unlocked")
    private Boolean explorerFrameUnlocked;

    @Column(name = "explorer_frame_unlocked_at")
    private LocalDateTime explorerFrameUnlockedAt;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}