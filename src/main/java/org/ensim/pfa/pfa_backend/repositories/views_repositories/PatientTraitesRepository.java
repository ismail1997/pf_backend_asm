package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.PatientTraites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientTraitesRepository extends JpaRepository<PatientTraites, Long> {

    @Query("select p from PatientTraites p")
    Page<PatientTraites> findAll(Pageable pageable);
}
