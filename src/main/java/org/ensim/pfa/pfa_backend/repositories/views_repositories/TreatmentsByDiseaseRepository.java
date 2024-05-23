package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.TreatmentsByDisease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentsByDiseaseRepository extends JpaRepository<TreatmentsByDisease, String> {

    @Query("select t from TreatmentsByDisease t")
    Page<TreatmentsByDisease> findAll(Pageable pageable);
}
