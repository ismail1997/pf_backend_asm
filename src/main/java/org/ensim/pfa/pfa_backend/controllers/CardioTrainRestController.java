package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.services.CardioTrainService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardio_trains")
public class CardioTrainRestController {
    private CardioTrainService cardioTrainService;

    public CardioTrainRestController(CardioTrainService cardioTrainService) {
        this.cardioTrainService = cardioTrainService;
    }

    @GetMapping
    public Page<CardioTrain> getAllCardio(@RequestParam(name = "page",defaultValue = "0") int page ,
                                          @RequestParam(name = "size", defaultValue = "20") int size){
        return this.cardioTrainService.getAllCardioTrains(page, size);
    }
}
