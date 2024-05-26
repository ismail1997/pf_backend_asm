package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.HospitalDim;
import org.ensim.pfa.pfa_backend.services.HospitalDimService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital_dim")
public class HospitalDimRestController {

    private final HospitalDimService hospitalDimService;

    public HospitalDimRestController(HospitalDimService hospitalDimService) {
        this.hospitalDimService = hospitalDimService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<HospitalDim> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                    @RequestParam(name = "size", defaultValue = "20") int size) {
        return hospitalDimService.getAll(page, size);
    }
}
