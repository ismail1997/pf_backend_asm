package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.CardioTrainStg;
import org.ensim.pfa.pfa_backend.repositories.CardioTrainRepository;
import org.ensim.pfa.pfa_backend.repositories.CardioTrainStgRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CardioTrainStgService {
    private CardioTrainStgRepository cardioTrainStgRepository;

    public CardioTrainStgService(CardioTrainStgRepository cardioTrainStgRepository) {
        this.cardioTrainStgRepository = cardioTrainStgRepository;
    }


    public Page<CardioTrainStg> getAllCardioTrainsStg(int page , int size){
        return this.cardioTrainStgRepository.findAll(PageRequest.of(page,size));
    }
}
