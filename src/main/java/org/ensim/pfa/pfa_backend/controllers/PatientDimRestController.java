package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.PatientDim;
import org.ensim.pfa.pfa_backend.services.PatientDimService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patient_dim")
public class PatientDimRestController {

    private final PatientDimService patientDimService;

    public PatientDimRestController(PatientDimService patientDimService) {
        this.patientDimService = patientDimService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<PatientDim> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                   @RequestParam(name = "size", defaultValue = "20") int size) {
        return patientDimService.getAll(page, size);
    }
}
