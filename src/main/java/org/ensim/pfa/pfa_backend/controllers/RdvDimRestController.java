package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.RdvDim;
import org.ensim.pfa.pfa_backend.services.RdvDimService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rdv_dim")
public class RdvDimRestController {

    private final RdvDimService rdvDimService;

    public RdvDimRestController(RdvDimService rdvDimService) {
        this.rdvDimService = rdvDimService;
    }

    @GetMapping
    public Page<RdvDim> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                               @RequestParam(name = "size", defaultValue = "20") int size) {
        return rdvDimService.getAll(page, size);
    }
}
