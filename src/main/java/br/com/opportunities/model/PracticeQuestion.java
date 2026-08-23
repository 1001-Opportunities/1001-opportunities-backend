package br.com.opportunities.model;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;


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
import tools.jackson.databind.JsonNode;

@Entity
@Table(
        name = "simulado_questions",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "simulado_questions_exam_id_order_index_key",
                        columnNames = {"exam_id", "order_index"}
                )
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PracticeQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "exam_id", nullable = false)
    private UUID examId;

    @Column(name = "order_index", nullable = false)
    private Integer orderIndex;

    @Column(name = "subject")
    private String subject;

    @Column(name = "introduction", nullable = false)
    private String introduction;

    @Column(name = "image_url")
    private String imageUrl;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "alternatives", columnDefinition = "jsonb", nullable = false)
    private JsonNode alternatives;

    @Column(name = "correct_sum")
    private Integer correctSum;

    @Column(name = "explanation")
    private String explanation;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
}