package org.ensim.pfa.pfa_backend.repositories;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.CardioTrainStg;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CardioTrainStgRepository extends JpaRepository<CardioTrainStg,Integer> {

    @Query("select cts from CardioTrainStg cts")
    Page<CardioTrainStg> findAll(Pageable pageable);
}
