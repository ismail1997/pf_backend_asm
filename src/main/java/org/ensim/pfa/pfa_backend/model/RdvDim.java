package org.ensim.pfa.pfa_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rdv_dim", schema = "airbyte_schema")
public class RdvDim {

    @Id
    @Column(name = "rdv_id")
    private Long rdvId;

    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "hospital_id")
    private Long hospitalId;

    @Column(name = "rdv_date")
    private LocalDate rdvDate;

    @Column(name = "rdv_type")
    private String rdvType;
}
