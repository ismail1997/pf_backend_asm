package org.ensim.pfa.pfa_backend.model.views;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patients_infos", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientsInfos {

    @Id
    @Column(name = "id_patient")
    private Long idPatient;

    @Column(name = "patient_name")
    private String patientName;

    @Column(name = "patient_age")
    private Integer patientAge;

    @Column(name = "blood_type")
    private String bloodType;

    @Column(name = "gender")
    private String gender;
}
