package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mental_health_dataset", schema = "airbyte_schema")
public class MentalHealthDataset {

    @Id
    @Column(name = "_airbyte_ab_id")
    private String airbyteAbId;

    @Column(name = "treatment")
    private String treatment;

    @Column(name = "family_history")
    private String familyHistory;

    @Column(name = "coping_struggles")
    private String copingStruggles;

    @Column(name = "mood_swings")
    private String moodSwings;

    @Column(name = "gender")
    private String gender;

    @Column(name = "Timestamp")
    private String timestamp;

    @Column(name = "work_interest")
    private String workInterest;

    @Column(name = "mental_health_interview")
    private String mentalHealthInterview;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "days_indoors")
    private String daysIndoors;

    @Column(name = "care_options")
    private String careOptions;

    @Column(name = "social_weakness")
    private String socialWeakness;

    @Column(name = "self_employed")
    private String selfEmployed;

    @Column(name = "country")
    private String country;

    @Column(name = "changes_habits")
    private String changesHabits;

    @Column(name = "growing_stress")
    private String growingStress;

    @Column(name = "mental_health_history")
    private String mentalHealthHistory;

    @Column(name = "_airbyte_emitted_at")
    private LocalDateTime airbyteEmittedAt;

    @Column(name = "_airbyte_normalized_at")
    private LocalDateTime airbyteNormalizedAt;

    @Column(name = "_airbyte_mental_health_dataset_hashid")
    private String airbyteMentalHealthDatasetHashid;
}
