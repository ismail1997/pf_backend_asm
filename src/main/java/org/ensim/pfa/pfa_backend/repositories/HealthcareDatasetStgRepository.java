package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.HealthcareDatasetStg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthcareDatasetStgRepository extends JpaRepository<HealthcareDatasetStg, Long> {

    @Query("select hds from HealthcareDatasetStg hds")
    Page<HealthcareDatasetStg> findAll(Pageable pageable);
}
