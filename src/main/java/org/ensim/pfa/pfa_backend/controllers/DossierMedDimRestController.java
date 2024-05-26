package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.CardioTrainStg;
import org.ensim.pfa.pfa_backend.model.DoctorDim;
import org.ensim.pfa.pfa_backend.model.DossierMedDim;
import org.ensim.pfa.pfa_backend.repositories.DossierMedDimRepository;
import org.ensim.pfa.pfa_backend.services.CardioTrainStgService;
import org.ensim.pfa.pfa_backend.services.DossierMedDimService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dossier_med_dim")
public class DossierMedDimRestController {
    private DossierMedDimService dossierMedDimService;

    public DossierMedDimRestController(DossierMedDimService dossierMedDimService) {
        this.dossierMedDimService = dossierMedDimService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<DossierMedDim> getAllCardio(@RequestParam(name = "page",defaultValue = "0") int page ,
                                            @RequestParam(name = "size", defaultValue = "20") int size){
        return this.dossierMedDimService.getAll(page, size);
    }
}
