package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.MentalTreatmentsOverTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface MentalTreatmentsOverTimeRepository extends JpaRepository<MentalTreatmentsOverTime, LocalDateTime> {

    @Query("select m from MentalTreatmentsOverTime m")
    Page<MentalTreatmentsOverTime> findAll(Pageable pageable);
}
