package org.ensim.pfa.pfa_backend.controllers.views_controllers;

import org.ensim.pfa.pfa_backend.model.views.DiagnosticsEvolutionByDate;
import org.ensim.pfa.pfa_backend.services.views_services.DiagnosticsEvolutionByDateService;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/diagnostics_evolution_by_date")
public class DiagnosticsEvolutionByDateRestController {
    private final DiagnosticsEvolutionByDateService diagnosticsEvolutionByDateService;

    public DiagnosticsEvolutionByDateRestController(DiagnosticsEvolutionByDateService diagnosticsEvolutionByDateService) {
        this.diagnosticsEvolutionByDateService = diagnosticsEvolutionByDateService;
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('SCOPE_DOCTEUR', 'SCOPE_ADMIN')")
    public Page<DiagnosticsEvolutionByDate> getAllDiagnosticsEvolutionByDate(@RequestParam(name = "page", defaultValue = "0") int page,
                                                                             @RequestParam(name = "size", defaultValue = "20") int size) {
        return this.diagnosticsEvolutionByDateService.getAllDiagnosticsEvolutionByDate(page, size);
    }
}
