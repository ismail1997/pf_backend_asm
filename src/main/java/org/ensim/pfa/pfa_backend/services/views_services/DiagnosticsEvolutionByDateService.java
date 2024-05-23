package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.DiagnosticsEvolutionByDate;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.DiagnosticsEvolutionByDateRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiagnosticsEvolutionByDateService {
    private final DiagnosticsEvolutionByDateRepository diagnosticsEvolutionByDateRepository;

    public DiagnosticsEvolutionByDateService(DiagnosticsEvolutionByDateRepository diagnosticsEvolutionByDateRepository) {
        this.diagnosticsEvolutionByDateRepository = diagnosticsEvolutionByDateRepository;
    }

    public Page<DiagnosticsEvolutionByDate> getAllDiagnosticsEvolutionByDate(int page, int size) {
        return this.diagnosticsEvolutionByDateRepository.findAll(PageRequest.of(page, size));
    }
}
