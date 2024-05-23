package org.ensim.pfa.pfa_backend.repositories.views_repositories;

import org.ensim.pfa.pfa_backend.model.views.DiagnosticsByType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface DiagnosticsByTypeRepository extends JpaRepository<DiagnosticsByType, String> {

    @Query("select d from DiagnosticsByType d")
    Page<DiagnosticsByType> findAll(Pageable pageable);
}
