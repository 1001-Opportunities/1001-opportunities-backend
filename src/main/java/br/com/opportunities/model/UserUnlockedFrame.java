package br.com.opportunities.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user_unlocked_frames")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUnlockedFrame {
    @EmbeddedId
    private UserUnlockedFrameId id;

    @Column(name = "granted_by")
    private UUID grantedBy;

    @Column(name = "granted_at", nullable = false)
    private OffsetDateTime grantedAt;
}