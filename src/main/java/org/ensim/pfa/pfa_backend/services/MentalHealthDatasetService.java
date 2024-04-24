package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.MentalHealthDataset;
import org.ensim.pfa.pfa_backend.repositories.MentalHealthDatasetRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MentalHealthDatasetService {
    private final MentalHealthDatasetRepository mentalHealthDatasetRepository;

    public MentalHealthDatasetService(MentalHealthDatasetRepository mentalHealthDatasetRepository) {
        this.mentalHealthDatasetRepository = mentalHealthDatasetRepository;
    }

    public Page<MentalHealthDataset> getAll(int page, int size){
        return mentalHealthDatasetRepository.findAll(PageRequest.of(page, size));
    }
}
