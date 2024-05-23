package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.AdmissionsOverTime;
import org.ensim.pfa.pfa_backend.services.views_services.AdmissionsOverTimeService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admissions_over_time")
public class AdmissionsOverTimeRestController {
    private final AdmissionsOverTimeService admissionsOverTimeService;

    public AdmissionsOverTimeRestController(AdmissionsOverTimeService admissionsOverTimeService) {
        this.admissionsOverTimeService = admissionsOverTimeService;
    }

    @GetMapping
    public Page<AdmissionsOverTime> getAllAdmissionsOverTime(@RequestParam(name = "page", defaultValue = "0") int page,
                                                             @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.admissionsOverTimeService.getAllAdmissionsOverTime(page, size);
    }
}
