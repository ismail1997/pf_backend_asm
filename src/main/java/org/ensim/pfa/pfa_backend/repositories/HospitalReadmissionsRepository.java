package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.HospitalReadmissions;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalReadmissionsRepository extends JpaRepository<HospitalReadmissions, String> {

    @Query("select hr from HospitalReadmissions hr")
    Page<HospitalReadmissions> findAll(Pageable pageable);
}
