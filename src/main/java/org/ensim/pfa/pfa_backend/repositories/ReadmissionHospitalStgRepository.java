package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.ReadmissionHospitalStg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReadmissionHospitalStgRepository extends JpaRepository<ReadmissionHospitalStg, Long> {

    @Query("select r from ReadmissionHospitalStg r")
    Page<ReadmissionHospitalStg> findAll(Pageable pageable);
}
