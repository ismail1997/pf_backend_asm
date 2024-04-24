package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "healthcare_dataset_stg", schema = "airbyte_schema")
public class HealthcareDatasetStg {

    @Id
    @Column(name = "id_healthcare")
    private Long idHealthcare;

    @Column(name = "billing_amount")
    private Double billingAmount;

    @Column(name = "discharge_date")
    private LocalDate dischargeDate;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "test_results")
    private String testResults;

    @Column(name = "doctor")
    private String doctor;

    @Column(name = "gender_enum")
    private Integer genderEnum;

    @Column(name = "admission_type")
    private String admissionType;

    @Column(name = "date_of_admission")
    private LocalDate dateOfAdmission;

    @Column(name = "insurance_provider")
    private String insuranceProvider;

    @Column(name = "name")
    private String name;

    @Column(name = "blood_type_enum")
    private String bloodTypeEnum;

    @Column(name = "medication")
    private String medication;

    @Column(name = "hospital")
    private String hospital;

    @Column(name = "medical_condition")
    private String medicalCondition;

    @Column(name = "age")
    private Integer age;

    @Column(name = "time_stamp")
    private LocalDateTime timeStamp;
}
