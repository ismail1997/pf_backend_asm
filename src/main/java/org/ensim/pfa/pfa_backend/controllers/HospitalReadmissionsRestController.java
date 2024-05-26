package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.HospitalReadmissions;
import org.ensim.pfa.pfa_backend.services.HospitalReadmissionsService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital_readmissions")
public class HospitalReadmissionsRestController {

    private final HospitalReadmissionsService hospitalReadmissionsService;

    public HospitalReadmissionsRestController(HospitalReadmissionsService hospitalReadmissionsService) {
        this.hospitalReadmissionsService = hospitalReadmissionsService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<HospitalReadmissions> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                             @RequestParam(name = "size", defaultValue = "20") int size) {
        return hospitalReadmissionsService.getAll(page, size);
    }
}
