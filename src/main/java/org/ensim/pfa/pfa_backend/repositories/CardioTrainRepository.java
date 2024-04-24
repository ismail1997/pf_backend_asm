package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardioTrainRepository extends JpaRepository<CardioTrain,String> {

    @Query("select ct from CardioTrain ct")
    Page<CardioTrain> findAll(Pageable pageable);
}
