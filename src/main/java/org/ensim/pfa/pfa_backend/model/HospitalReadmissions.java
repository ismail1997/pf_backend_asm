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
@Table(name = "hospital_readmissions", schema = "airbyte_schema")
public class HospitalReadmissions {

    @Id
    @Column(name = "_airbyte_ab_id")
    private String airbyteAbId;

    @Column(name = "readmitted")
    private String readmitted;

    @Column(name = "n_inpatient")
    private String nInpatient;

    @Column(name = "diag_1")
    private String diag1;

    @Column(name = "n_lab_procedures")
    private String nLabProcedures;

    @Column(name = "diag_3")
    private String diag3;

    @Column(name = "n_outpatient")
    private String nOutpatient;

    @Column(name = "change")
    private String change;

    @Column(name = "diag_2")
    private String diag2;

    @Column(name = "diabetes_med")
    private String diabetesMed;

    @Column(name = "time_in_hospital")
    private String timeInHospital;

    @Column(name = "medical_specialty")
    private String medicalSpecialty;

    @Column(name = "glucose_test")
    private String glucoseTest;

    @Column(name = "n_procedures")
    private String nProcedures;

    @Column(name = "a1ctest")
    private String a1ctest;

    @Column(name = "age")
    private String age;

    @Column(name = "n_emergency")
    private String nEmergency;

    @Column(name = "n_medications")
    private String nMedications;

    @Column(name = "_airbyte_emitted_at")
    private LocalDateTime airbyteEmittedAt;

    @Column(name = "_airbyte_normalized_at")
    private LocalDateTime airbyteNormalizedAt;

    @Column(name = "_airbyte_hospital_readmissions_hashid")
    private String airbyteHospitalReadmissionsHashid;
}
