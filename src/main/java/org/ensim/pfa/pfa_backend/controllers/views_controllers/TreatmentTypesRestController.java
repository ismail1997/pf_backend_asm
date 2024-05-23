package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.TreatmentTypes;
import org.ensim.pfa.pfa_backend.services.views_services.TreatmentTypesService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/treatment_types")
public class TreatmentTypesRestController {
    private final TreatmentTypesService treatmentTypesService;

    public TreatmentTypesRestController(TreatmentTypesService treatmentTypesService) {
        this.treatmentTypesService = treatmentTypesService;
    }

    @GetMapping
    public Page<TreatmentTypes> getAllTreatmentTypes(@RequestParam(name = "page", defaultValue = "0") int page,
                                                     @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.treatmentTypesService.getAllTreatmentTypes(page, size);
    }
}
