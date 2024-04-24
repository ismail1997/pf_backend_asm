package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.DossierMedDim;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierMedDimRepository extends JpaRepository<DossierMedDim,Long> {

    @Query("select dossierMedDim from DossierMedDim dossierMedDim")
    Page<DossierMedDim> findAll(Pageable pageable);
}
