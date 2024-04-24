package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.HealthcareDatasetStg;
import org.ensim.pfa.pfa_backend.repositories.HealthcareDatasetStgRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HealthcareDatasetStgService {
    private final HealthcareDatasetStgRepository healthcareDatasetStgRepository;

    public HealthcareDatasetStgService(HealthcareDatasetStgRepository healthcareDatasetStgRepository) {
        this.healthcareDatasetStgRepository = healthcareDatasetStgRepository;
    }

    public Page<HealthcareDatasetStg> getAll(int page, int size) {
        return healthcareDatasetStgRepository.findAll(PageRequest.of(page, size));
    }
}
