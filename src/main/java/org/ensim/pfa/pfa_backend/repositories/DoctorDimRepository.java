package org.ensim.pfa.pfa_backend.repositories;


import org.ensim.pfa.pfa_backend.model.DoctorDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorDimRepository extends JpaRepository<DoctorDim,Long> {
    @Query("select dm from DoctorDim dm")
    Page<DoctorDim> findAll(Pageable pageable);
}
