package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsOverTime;
import org.ensim.pfa.pfa_backend.services.views_services.EmergencyVisitsOverTimeService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emergency_visits_over_time")
public class EmergencyVisitsOverTimeRestController {
    private final EmergencyVisitsOverTimeService emergencyVisitsOverTimeService;

    public EmergencyVisitsOverTimeRestController(EmergencyVisitsOverTimeService emergencyVisitsOverTimeService) {
        this.emergencyVisitsOverTimeService = emergencyVisitsOverTimeService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_GESTIONNAIRE','SCOPE_ADMIN'})")
    public Page<EmergencyVisitsOverTime> getAllEmergencyVisitsOverTime(@RequestParam(name = "page", defaultValue = "0") int page,
                                                                       @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.emergencyVisitsOverTimeService.getAllEmergencyVisitsOverTime(page, size);
    }
}
