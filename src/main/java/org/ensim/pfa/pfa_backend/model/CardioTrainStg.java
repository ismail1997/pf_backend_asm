package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cardio_train_stg", schema = "airbyte_schema")
@AllArgsConstructor @NoArgsConstructor
public class CardioTrainStg {

    @Id
    @Column(name = "id_cardio_train")
    private Integer idCardioTrain;

    @Column(name = "gluc")
    private Integer gluc;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "smoke")
    private Integer smoke;

    @Column(name = "active")
    private Integer active;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "cardio")
    private Integer cardio;

    @Column(name = "ap_lo")
    private Integer apLo;

    @Column(name = "cholesterol")
    private Integer cholesterol;

    @Column(name = "alco")
    private Integer alco;

    @Column(name = "ap_hi")
    private Integer apHi;

    @Column(name = "height")
    private Integer height;

    @Column(name = "age_years")
    private Integer ageYears;
}
