package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.MentalHealthDataset;
import org.ensim.pfa.pfa_backend.services.MentalHealthDatasetService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mental_health_dataset")
public class MentalHealthDatasetRestController {

    private final MentalHealthDatasetService mentalHealthDatasetService;

    public MentalHealthDatasetRestController(MentalHealthDatasetService mentalHealthDatasetService) {
        this.mentalHealthDatasetService = mentalHealthDatasetService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<MentalHealthDataset> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                            @RequestParam(name = "size", defaultValue = "20") int size) {
        return mentalHealthDatasetService.getAll(page, size);
    }
}
