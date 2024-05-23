package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsOverTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface EmergencyVisitsOverTimeRepository extends JpaRepository<EmergencyVisitsOverTime, LocalDateTime> {

    @Query("select e from EmergencyVisitsOverTime e")
    Page<EmergencyVisitsOverTime> findAll(Pageable pageable);
}
