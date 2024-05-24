package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsOverTime;
import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsPerHospital;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmergencyVisitsPerHospitalRepository extends JpaRepository<EmergencyVisitsPerHospital,Long> {

    @Query("select e from EmergencyVisitsPerHospital e")
    Page<EmergencyVisitsPerHospital> findAll(Pageable pageable);
}
