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
@Table(name = "hospital_dim", schema = "airbyte_schema")
public class HospitalDim {

    @Id
    @Column(name = "hospital_id")
    private Long hospitalId;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "patient_count")
    private Long patientCount;

    @Column(name = "room_count")
    private Long roomCount;
}
