package org.ensim.pfa.pfa_backend.controllers;

import org.ensim.pfa.pfa_backend.model.ReadmissionHospitalStg;
import org.ensim.pfa.pfa_backend.services.ReadmissionHospitalStgService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/readmission_hospital_stg")
public class ReadmissionHospitalStgRestController {

    private final ReadmissionHospitalStgService readmissionHospitalStgService;

    public ReadmissionHospitalStgRestController(ReadmissionHospitalStgService readmissionHospitalStgService) {
        this.readmissionHospitalStgService = readmissionHospitalStgService;
    }

    @GetMapping
    public Page<ReadmissionHospitalStg> getAll(@RequestParam(name = "page", defaultValue = "0") int page,
                                               @RequestParam(name = "size", defaultValue = "20") int size) {
        return readmissionHospitalStgService.getAll(page, size);
    }
}
