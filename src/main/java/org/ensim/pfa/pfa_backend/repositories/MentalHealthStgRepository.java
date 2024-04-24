package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.MentalHealthStg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MentalHealthStgRepository extends JpaRepository<MentalHealthStg, Long> {

    @Query("select m from MentalHealthStg m")
    Page<MentalHealthStg> findAll(Pageable pageable);
}
