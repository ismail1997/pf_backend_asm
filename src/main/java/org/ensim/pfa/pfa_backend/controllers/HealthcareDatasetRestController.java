package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.HealthcareDataset;
import org.ensim.pfa.pfa_backend.services.HealthcareDatasetService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcare_dataset")
public class HealthcareDatasetRestController {

    private final HealthcareDatasetService healthcareDatasetService;

    public HealthcareDatasetRestController(HealthcareDatasetService healthcareDatasetService) {
        this.healthcareDatasetService = healthcareDatasetService;
    }

    @GetMapping
    public Page<HealthcareDataset> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                          @RequestParam(name = "size", defaultValue = "20") int size) {
        return healthcareDatasetService.getAll(page, size);
    }
}
