package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.HospitalDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalDimRepository extends JpaRepository<HospitalDim, Long> {

    @Query("select h from HospitalDim h")
    Page<HospitalDim> findAll(Pageable pageable);
}
