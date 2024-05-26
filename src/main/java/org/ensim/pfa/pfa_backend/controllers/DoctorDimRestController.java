package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.DoctorDim;
import org.ensim.pfa.pfa_backend.services.CardioTrainService;
import org.ensim.pfa.pfa_backend.services.DoctorDimService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor_dim")
public class DoctorDimRestController {
    private DoctorDimService doctorDimService;

    public DoctorDimRestController(DoctorDimService doctorDimService) {
        this.doctorDimService = doctorDimService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority({'SCOPE_DOCTEUR','SCOPE_ADMIN'})")
    public Page<DoctorDim> getAll(@RequestParam(name = "page",defaultValue = "0") int page ,
                                        @RequestParam(name = "size", defaultValue = "20") int size){
        return this.doctorDimService.getAllDoctorDims(page, size);
    }
}
