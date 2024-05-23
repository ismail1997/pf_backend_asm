package org.ensim.pfa.pfa_backend.model.views;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "my_second_dbt_model", schema = "airbyte_schema")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MySecondDbtModel {

    @Id
    @Column(name = "id")
    private Long id;
}
