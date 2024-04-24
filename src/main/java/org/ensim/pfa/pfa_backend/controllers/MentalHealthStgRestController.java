package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.MentalHealthStg;
import org.ensim.pfa.pfa_backend.services.MentalHealthStgService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mental_health_stg")
public class MentalHealthStgRestController {

    private final MentalHealthStgService mentalHealthStgService;

    public MentalHealthStgRestController(MentalHealthStgService mentalHealthStgService) {
        this.mentalHealthStgService = mentalHealthStgService;
    }

    @GetMapping
    public Page<MentalHealthStg> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                        @RequestParam(name = "size", defaultValue = "20") int size) {
        return mentalHealthStgService.getAll(page, size);
    }
}
