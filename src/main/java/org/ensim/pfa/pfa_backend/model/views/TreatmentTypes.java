package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "treatment_types", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreatmentTypes {

    @Id
    @Column(name = "type_traitement")
    private String typeTraitement;

    @Column(name = "nombre_traitements")
    private Long nombreTraitements;
}
