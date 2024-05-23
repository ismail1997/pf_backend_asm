package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.TreatmentTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface TreatmentTypesRepository extends JpaRepository<TreatmentTypes, String> {

    @Query("select t from TreatmentTypes t")
    Page<TreatmentTypes> findAll(Pageable pageable);
}
