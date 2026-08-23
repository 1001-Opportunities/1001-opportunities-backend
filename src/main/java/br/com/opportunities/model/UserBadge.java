package br.com.opportunities.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "user_badges",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "user_badges_user_id_badge_id_subject_key",
                        columnNames = {"user_id", "badge_id", "subject"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserBadge {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(name = "badge_id", nullable = false)
    private String badgeId;

    @Column(name = "subject")
    private String subject;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "icon")
    private String icon;

    @Column(name = "color")
    private String color;

    @Column(name = "granted_by")
    private UUID grantedBy;

    @CreationTimestamp
    @Column(name = "granted_at", nullable = false, updatable = false)
    private OffsetDateTime grantedAt;
}