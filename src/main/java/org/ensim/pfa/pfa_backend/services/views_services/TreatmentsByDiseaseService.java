package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.TreatmentsByDisease;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.TreatmentsByDiseaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TreatmentsByDiseaseService {
    private final TreatmentsByDiseaseRepository treatmentsByDiseaseRepository;

    public TreatmentsByDiseaseService(TreatmentsByDiseaseRepository treatmentsByDiseaseRepository) {
        this.treatmentsByDiseaseRepository = treatmentsByDiseaseRepository;
    }

    public Page<TreatmentsByDisease> getAllTreatmentsByDisease(int page, int size) {
        return this.treatmentsByDiseaseRepository.findAll(PageRequest.of(page, size));
    }
}
