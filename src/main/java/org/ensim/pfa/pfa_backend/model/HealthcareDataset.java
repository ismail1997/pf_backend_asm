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
@Table(name = "healthcare_dataset", schema = "airbyte_schema")
@AllArgsConstructor @NoArgsConstructor
public class HealthcareDataset {

    @Id
    @Column(name = "_airbyte_ab_id")
    private String airbyteAbId;

    @Column(name = "Billing Amount")
    private String billingAmount;

    @Column(name = "Discharge Date")
    private String dischargeDate;

    @Column(name = "Room Number")
    private String roomNumber;

    @Column(name = "Test Results")
    private String testResults;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "gender")
    private String gender;

    @Column(name = "Admission Type")
    private String admissionType;

    @Column(name = "Date of Admission")
    private String dateOfAdmission;

    @Column(name = "Insurance Provider")
    private String insuranceProvider;

    @Column(name = "Name")
    private String name;

    @Column(name = "Blood Type")
    private String bloodType;

    @Column(name = "medication")
    private String medication;

    @Column(name = "hospital")
    private String hospital;

    @Column(name = "Medical Condition")
    private String medicalCondition;

    @Column(name = "age")
    private String age;

    @Column(name = "_airbyte_emitted_at")
    private LocalDateTime airbyteEmittedAt;

    @Column(name = "_airbyte_normalized_at")
    private LocalDateTime airbyteNormalizedAt;

    @Column(name = "_airbyte_healthcare_dataset_hashid")
    private String airbyteHealthcareDatasetHashid;
}
