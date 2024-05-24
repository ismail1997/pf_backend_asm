package org.ensim.pfa.pfa_backend.model.views;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emergency_visits_per_hospital", schema = "airbyte_schema") // Replace "public" with the actual schema if different
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmergencyVisitsPerHospital {
    @Id
    @Column(name = "id_hopital")
    private Long idHopital;

    @Column(name = "hospital_name")
    private String hospitalName;

    @Column(name = "nombre_visites")
    private Long nombreVisites;
}
