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
@Table(name = "readmission_hospital_stg", schema = "airbyte_schema")
public class ReadmissionHospitalStg {

    @Id
    @Column(name = "id_readmisson")
    private Long idReadmission;

    @Column(name = "readmitted_enum")
    private String readmittedEnum;

    @Column(name = "n_inpatient")
    private Integer nInpatient;

    @Column(name = "diag_1")
    private String diag1;

    @Column(name = "n_lab_procedures")
    private Integer nLabProcedures;

    @Column(name = "diag_3")
    private String diag3;

    @Column(name = "n_outpatient")
    private Integer nOutpatient;

    @Column(name = "change_enum")
    private String changeEnum;

    @Column(name = "diag_2")
    private String diag2;

    @Column(name = "diabetes_med_enum")
    private String diabetesMedEnum;

    @Column(name = "time_in_hospital")
    private Integer timeInHospital;

    @Column(name = "medical_specialty")
    private String medicalSpecialty;

    @Column(name = "glucose_test_enum")
    private String glucoseTestEnum;

    @Column(name = "n_procedures")
    private Integer nProcedures;

    @Column(name = "a1ctest")
    private String a1ctest;

    @Column(name = "age")
    private String age;

    @Column(name = "n_emergency")
    private Integer nEmergency;

    @Column(name = "n_medications")
    private Integer nMedications;
}
