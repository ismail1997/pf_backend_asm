package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "heart_stg", schema = "airbyte_schema")
public class HeartStg {

    @Id
    @Column(name = "id_heart")
    private Long idHeart;

    @Column(name = "exang")
    private Integer exang;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "thal")
    private Integer thal;

    @Column(name = "chol")
    private Integer chol;

    @Column(name = "slope")
    private Integer slope;

    @Column(name = "cp")
    private Integer cp;

    @Column(name = "target")
    private Integer target;

    @Column(name = "trestbps")
    private Integer trestbps;

    @Column(name = "oldpeak")
    private Double oldpeak;

    @Column(name = "thalach")
    private Integer thalach;

    @Column(name = "fbs")
    private Integer fbs;

    @Column(name = "ca")
    private Integer ca;

    @Column(name = "age")
    private Integer age;

    @Column(name = "restecg")
    private Integer restecg;
}
