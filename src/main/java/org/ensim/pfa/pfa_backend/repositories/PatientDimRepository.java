package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.PatientDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDimRepository extends JpaRepository<PatientDim, Long> {

    @Query("select p from PatientDim p")
    Page<PatientDim> findAll(Pageable pageable);
}
