package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.TreatmentsByDisease;
import org.ensim.pfa.pfa_backend.services.views_services.TreatmentsByDiseaseService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treatments_by_disease")
public class TreatmentsByDiseaseRestController {
    private final TreatmentsByDiseaseService treatmentsByDiseaseService;

    public TreatmentsByDiseaseRestController(TreatmentsByDiseaseService treatmentsByDiseaseService) {
        this.treatmentsByDiseaseService = treatmentsByDiseaseService;
    }

    @GetMapping
    public Page<TreatmentsByDisease> getAllTreatmentsByDisease(@RequestParam(name = "page", defaultValue = "0") int page,
                                                               @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.treatmentsByDiseaseService.getAllTreatmentsByDisease(page, size);
    }
}