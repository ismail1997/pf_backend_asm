package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.MentalTreatmentsOverTime;
import org.ensim.pfa.pfa_backend.services.views_services.MentalTreatmentsOverTimeService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mental_treatments_over_time")
public class MentalTreatmentsOverTimeRestController {
    private final MentalTreatmentsOverTimeService mentalTreatmentsOverTimeService;

    public MentalTreatmentsOverTimeRestController(MentalTreatmentsOverTimeService mentalTreatmentsOverTimeService) {
        this.mentalTreatmentsOverTimeService = mentalTreatmentsOverTimeService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<MentalTreatmentsOverTime> getAllMentalTreatmentsOverTime(@RequestParam(name = "page", defaultValue = "0") int page,
                                                                         @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.mentalTreatmentsOverTimeService.getAllMentalTreatmentsOverTime(page, size);
    }
}
