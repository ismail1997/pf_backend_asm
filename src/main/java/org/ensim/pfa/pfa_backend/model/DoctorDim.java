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
@Table(name = "doctor_dim", schema = "airbyte_schema")
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDim {

    @Id
    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "doctor_name")
    private String doctorName;

    @Column(name = "doctor_specialty")
    private String doctorSpecialty;
}
