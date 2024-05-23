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
@Table(name = "diagnostics_evolution_by_date", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiagnosticsEvolutionByDate {

    @Id
    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "type_diagnostic")
    private String typeDiagnostic;

    @Column(name = "nombre_diagnostics")
    private Long nombreDiagnostics;
}
