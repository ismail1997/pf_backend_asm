package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "diagnostics_by_type", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiagnosticsByType {

    @Id
    @Column(name = "type_diagnostic")
    private String typeDiagnostic;

    @Column(name = "nombre_diagnostics")
    private Long nombreDiagnostics;
}