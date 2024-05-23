package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.AdmissionsOverTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface AdmissionsOverTimeRepository extends JpaRepository<AdmissionsOverTime, LocalDateTime> {

    @Query("select a from AdmissionsOverTime a")
    Page<AdmissionsOverTime> findAll(Pageable pageable);
}
