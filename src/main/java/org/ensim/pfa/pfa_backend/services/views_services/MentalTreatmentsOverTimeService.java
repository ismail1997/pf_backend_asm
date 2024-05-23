package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.MentalTreatmentsOverTime;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.MentalTreatmentsOverTimeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MentalTreatmentsOverTimeService {
    private final MentalTreatmentsOverTimeRepository mentalTreatmentsOverTimeRepository;

    public MentalTreatmentsOverTimeService(MentalTreatmentsOverTimeRepository mentalTreatmentsOverTimeRepository) {
        this.mentalTreatmentsOverTimeRepository = mentalTreatmentsOverTimeRepository;
    }

    public Page<MentalTreatmentsOverTime> getAllMentalTreatmentsOverTime(int page, int size) {
        return this.mentalTreatmentsOverTimeRepository.findAll(PageRequest.of(page, size));
    }
}
