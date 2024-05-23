package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.AdmissionsOverTime;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.AdmissionsOverTimeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdmissionsOverTimeService {
    private final AdmissionsOverTimeRepository admissionsOverTimeRepository;

    public AdmissionsOverTimeService(AdmissionsOverTimeRepository admissionsOverTimeRepository) {
        this.admissionsOverTimeRepository = admissionsOverTimeRepository;
    }

    public Page<AdmissionsOverTime> getAllAdmissionsOverTime(int page, int size) {
        return this.admissionsOverTimeRepository.findAll(PageRequest.of(page, size));
    }
}
