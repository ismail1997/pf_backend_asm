package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.Heart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartRepository extends JpaRepository<Heart, String> {

    @Query("select h from Heart h")
    Page<Heart> findAll(Pageable pageable);
}
