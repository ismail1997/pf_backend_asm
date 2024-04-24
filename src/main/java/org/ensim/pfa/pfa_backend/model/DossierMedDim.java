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
@Table(name = "dossier_med_dim", schema = "airbyte_schema")
@AllArgsConstructor @NoArgsConstructor
public class DossierMedDim {

    @Id
    @Column(name = "id_dossier_medical")
    private Long idDossierMedical;

    @Column(name = "maladie")
    private String maladie;

    @Column(name = "solution")
    private String solution;

    @Column(name = "results")
    private String results;
}
