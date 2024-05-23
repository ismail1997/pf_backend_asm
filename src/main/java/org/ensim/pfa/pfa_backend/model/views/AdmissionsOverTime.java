package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "admissions_over_time", schema = "airbyte_schema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdmissionsOverTime {

    @Id
    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "nombre_admissions")
    private Long nombreAdmissions;


}
