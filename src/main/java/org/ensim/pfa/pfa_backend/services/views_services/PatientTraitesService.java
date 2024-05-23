package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.PatientTraites;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.PatientTraitesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientTraitesService {
    private final PatientTraitesRepository patientTraitesRepository;

    public PatientTraitesService(PatientTraitesRepository patientTraitesRepository) {
        this.patientTraitesRepository = patientTraitesRepository;
    }

    public Page<PatientTraites> getAllPatientTraites(int page, int size) {
        return this.patientTraitesRepository.findAll(PageRequest.of(page, size));
    }
}
