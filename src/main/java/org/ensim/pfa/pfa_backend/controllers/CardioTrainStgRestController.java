package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.CardioTrainStg;
import org.ensim.pfa.pfa_backend.services.CardioTrainService;
import org.ensim.pfa.pfa_backend.services.CardioTrainStgService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardio_train_stg")
public class CardioTrainStgRestController {
    private CardioTrainStgService cardioTrainStgService;

    public CardioTrainStgRestController(CardioTrainStgService cardioTrainStgService) {
        this.cardioTrainStgService = cardioTrainStgService;
    }

    @GetMapping
    public Page<CardioTrainStg> getAllCardio(@RequestParam(name = "page",defaultValue = "0") int page ,
                                             @RequestParam(name = "size", defaultValue = "20") int size){
        return this.cardioTrainStgService.getAllCardioTrainsStg(page, size);
    }
}
