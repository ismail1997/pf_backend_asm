package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsOverTime;
import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsPerHospital;
import org.ensim.pfa.pfa_backend.services.views_services.EmergencyVisitsPerHospitalService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emergency_visits_per_hospital")
public class EmergencyVisitsPerHospitalController {

    private final EmergencyVisitsPerHospitalService emergencyVisitsPerHospitalService;

    public EmergencyVisitsPerHospitalController(EmergencyVisitsPerHospitalService emergencyVisitsPerHospitalService) {
        this.emergencyVisitsPerHospitalService = emergencyVisitsPerHospitalService;
    }

    @GetMapping
    public Page<EmergencyVisitsPerHospital> getAllEmergencyVisitsPerHospital(@RequestParam(name = "page", defaultValue = "0") int page,
                                                                          @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.emergencyVisitsPerHospitalService.getAllEmergencyVisitesPerHospital(page, size);
    }
}