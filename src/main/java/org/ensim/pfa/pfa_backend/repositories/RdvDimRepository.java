package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.RdvDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RdvDimRepository extends JpaRepository<RdvDim, Long> {

    @Query("select r from RdvDim r")
    Page<RdvDim> findAll(Pageable pageable);
}
