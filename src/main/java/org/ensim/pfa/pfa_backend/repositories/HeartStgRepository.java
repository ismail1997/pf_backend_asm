package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.HeartStg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartStgRepository extends JpaRepository<HeartStg, Long> {

    @Query("select hs from HeartStg hs")
    Page<HeartStg> findAll(Pageable pageable);
}
