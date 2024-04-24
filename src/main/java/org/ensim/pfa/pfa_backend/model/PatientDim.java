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
@Table(name = "patient_dim", schema = "airbyte_schema")
public class PatientDim {

    @Id
    @Column(name = "id_patient")
    private Long idPatient;

    @Column(name = "patient_id_from_stg")
    private Long patientIdFromStg;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_age")
    private Integer patientAge;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "gender")
    private Integer gender;
}
