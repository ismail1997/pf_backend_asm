package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.DiagnosticsByType;
import org.ensim.pfa.pfa_backend.services.views_services.DiagnosticsByTypeService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnostics_by_type")
public class DiagnosticsByTypeRestController {
    private final DiagnosticsByTypeService diagnosticsByTypeService;

    public DiagnosticsByTypeRestController(DiagnosticsByTypeService diagnosticsByTypeService) {
        this.diagnosticsByTypeService = diagnosticsByTypeService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('SCOPE_DOCTEUR', 'SCOPE_ADMIN')")
    public Page<DiagnosticsByType> getAllDiagnosticsByType(@RequestParam(name = "page", defaultValue = "0") int page,
                                                           @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.diagnosticsByTypeService.getAllDiagnosticsByType(page, size);
    }
}
