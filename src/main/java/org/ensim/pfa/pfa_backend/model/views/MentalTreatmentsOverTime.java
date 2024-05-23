package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "mental_treatments_over_time", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MentalTreatmentsOverTime {

    @Id
    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "type_treatment")
    private String typeTreatment;

    @Column(name = "nombre_treatments")
    private Long nombreTreatments;
}
