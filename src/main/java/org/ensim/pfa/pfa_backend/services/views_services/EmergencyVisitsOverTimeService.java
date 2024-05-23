package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsOverTime;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.EmergencyVisitsOverTimeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmergencyVisitsOverTimeService {
    private final EmergencyVisitsOverTimeRepository emergencyVisitsOverTimeRepository;

    public EmergencyVisitsOverTimeService(EmergencyVisitsOverTimeRepository emergencyVisitsOverTimeRepository) {
        this.emergencyVisitsOverTimeRepository = emergencyVisitsOverTimeRepository;
    }

    public Page<EmergencyVisitsOverTime> getAllEmergencyVisitsOverTime(int page, int size) {
        return this.emergencyVisitsOverTimeRepository.findAll(PageRequest.of(page, size));
    }
}
