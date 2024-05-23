package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "patient_traites", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientTraites {

    @Id
    @Column(name = "total_patients_treated")
    private Long totalPatientsTreated;

    @Column(name = "total_treatments")
    private Long totalTreatments;
}
