package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.HealthcareDataset;
import org.ensim.pfa.pfa_backend.repositories.HealthcareDatasetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HealthcareDatasetService {
    private final HealthcareDatasetRepository healthcareDatasetRepository;

    public HealthcareDatasetService(HealthcareDatasetRepository healthcareDatasetRepository) {
        this.healthcareDatasetRepository = healthcareDatasetRepository;
    }

    public Page<HealthcareDataset> getAll(int page, int size) {
        return healthcareDatasetRepository.findAll(PageRequest.of(page, size));
    }
}
