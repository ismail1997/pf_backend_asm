package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.HealthcareDataset;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthcareDatasetRepository extends JpaRepository<HealthcareDataset, String> {

    @Query("select hd from HealthcareDataset hd")
    Page<HealthcareDataset> findAll(Pageable pageable);
}
