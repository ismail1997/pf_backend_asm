package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.repositories.CardioTrainRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CardioTrainService {
    private CardioTrainRepository cardioTrainRepository;

    public CardioTrainService(CardioTrainRepository cardioTrainRepository) {
        this.cardioTrainRepository = cardioTrainRepository;
    }


    public Page<CardioTrain> getAllCardioTrains(int page , int size){
        return this.cardioTrainRepository.findAll(PageRequest.of(page,size));
    }
}
