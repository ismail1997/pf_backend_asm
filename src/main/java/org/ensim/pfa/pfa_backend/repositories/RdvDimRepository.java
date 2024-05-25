package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.RdvDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RdvDimRepository extends JpaRepository<RdvDim, Long> {

    @Query("select r from RdvDim r")
    Page<RdvDim> findAll(Pageable pageable);

    @Query("select r from RdvDim r where year(r.rdvDate) = :year")
    Page<RdvDim> findAllByYear(@Param("year") int year, Pageable pageable);
}
