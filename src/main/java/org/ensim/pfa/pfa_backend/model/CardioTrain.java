package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "cardio_train", schema = "airbyte_schema")
@Data @AllArgsConstructor
@NoArgsConstructor
public class CardioTrain {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "gluc")
    private String gluc;

    @Column(name = "gender")
    private String gender;

    @Column(name = "smoke")
    private String smoke;

    @Column(name = "active")
    private String active;

    @Column(name = "weight")
    private String weight;

    @Column(name = "cardio")
    private String cardio;

    @Column(name = "ap_lo")
    private String apLo;

    @Column(name = "cholesterol")
    private String cholesterol;

    @Column(name = "alco")
    private String alco;

    @Column(name = "ap_hi")
    private String apHi;

    @Column(name = "age")
    private String age;

    @Column(name = "height")
    private String height;

    @Column(name = "_airbyte_ab_id")
    private String airbyteAbId;

    @Column(name = "_airbyte_emitted_at")
    private LocalDateTime airbyteEmittedAt;

    @Column(name = "_airbyte_normalized_at")
    private LocalDateTime airbyteNormalizedAt;

    @Column(name = "_airbyte_cardio_train_hashid")
    private String airbyteCardioTrainHashid;

}