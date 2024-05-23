package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.TreatmentTypes;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.TreatmentTypesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TreatmentTypesService {
    private final TreatmentTypesRepository treatmentTypesRepository;

    public TreatmentTypesService(TreatmentTypesRepository treatmentTypesRepository) {
        this.treatmentTypesRepository = treatmentTypesRepository;
    }

    public Page<TreatmentTypes> getAllTreatmentTypes(int page, int size) {
        return this.treatmentTypesRepository.findAll(PageRequest.of(page, size));
    }
}
