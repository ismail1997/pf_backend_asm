package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.DiagnosticsByType;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.DiagnosticsByTypeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DiagnosticsByTypeService {
    private final DiagnosticsByTypeRepository diagnosticsByTypeRepository;

    public DiagnosticsByTypeService(DiagnosticsByTypeRepository diagnosticsByTypeRepository) {
        this.diagnosticsByTypeRepository = diagnosticsByTypeRepository;
    }

    public Page<DiagnosticsByType> getAllDiagnosticsByType(int page, int size) {
        return this.diagnosticsByTypeRepository.findAll(PageRequest.of(page, size));
    }
}
