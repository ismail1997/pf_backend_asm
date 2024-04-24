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
@Table(name = "heart", schema = "airbyte_schema")
public class Heart {

    @Id
    @Column(name = "_airbyte_ab_id")
    private String airbyteAbId;

    @Column(name = "exang")
    private String exang;

    @Column(name = "sex")
    private String sex;

    @Column(name = "thal")
    private String thal;

    @Column(name = "chol")
    private String chol;

    @Column(name = "slope")
    private String slope;

    @Column(name = "cp")
    private String cp;

    @Column(name = "target")
    private String target;

    @Column(name = "trestbps")
    private String trestbps;

    @Column(name = "oldpeak")
    private String oldpeak;

    @Column(name = "thalach")
    private String thalach;

    @Column(name = "fbs")
    private String fbs;

    @Column(name = "ca")
    private String ca;

    @Column(name = "age")
    private String age;

    @Column(name = "restecg")
    private String restecg;

    @Column(name = "_airbyte_emitted_at")
    private LocalDateTime airbyteEmittedAt;

    @Column(name = "_airbyte_normalized_at")
    private LocalDateTime airbyteNormalizedAt;

    @Column(name = "_airbyte_heart_hashid")
    private String airbyteHeartHashid;
}
