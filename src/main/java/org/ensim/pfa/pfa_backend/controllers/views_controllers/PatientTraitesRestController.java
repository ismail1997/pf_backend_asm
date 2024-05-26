package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.PatientTraites;
import org.ensim.pfa.pfa_backend.services.views_services.PatientTraitesService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient_traites")
public class PatientTraitesRestController {
    private final PatientTraitesService patientTraitesService;

    public PatientTraitesRestController(PatientTraitesService patientTraitesService) {
        this.patientTraitesService = patientTraitesService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<PatientTraites> getAllPatientTraites(@RequestParam(name = "page", defaultValue = "0") int page,
                                                     @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.patientTraitesService.getAllPatientTraites(page, size);
    }
}
