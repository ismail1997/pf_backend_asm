package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.PatientsInfos;
import org.ensim.pfa.pfa_backend.services.views_services.PatientsInfosService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients_infos")
public class PatientsInfosRestController {
    private final PatientsInfosService patientsInfosService;

    public PatientsInfosRestController(PatientsInfosService patientsInfosService) {
        this.patientsInfosService = patientsInfosService;
    }

    @GetMapping
    public Page<PatientsInfos> getAllPatientsInfos(@RequestParam(name = "page", defaultValue = "0") int page,
                                                   @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.patientsInfosService.getAllPatientsInfos(page, size);
    }
}
