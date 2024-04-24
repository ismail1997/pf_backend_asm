package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.MentalHealthDataset;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MentalHealthDatasetRepository extends JpaRepository<MentalHealthDataset, String> {

    @Query("select m from MentalHealthDataset m")
    Page<MentalHealthDataset> findAll(Pageable pageable);
}
