package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.HealthcareDatasetStg;
import org.ensim.pfa.pfa_backend.services.HealthcareDatasetStgService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcare_dataset_stg")
public class HealthcareDatasetStgRestController {

    private final HealthcareDatasetStgService healthcareDatasetStgService;

    public HealthcareDatasetStgRestController(HealthcareDatasetStgService healthcareDatasetStgService) {
        this.healthcareDatasetStgService = healthcareDatasetStgService;
    }

    @GetMapping
    public Page<HealthcareDatasetStg> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                             @RequestParam(name = "size", defaultValue = "20") int size) {
        return healthcareDatasetStgService.getAll(page, size);
    }
}
