package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.EmergencyVisitsPerHospital;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.EmergencyVisitsPerHospitalRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmergencyVisitsPerHospitalService {
    private final EmergencyVisitsPerHospitalRepository emergencyVisitsPerHospitalRepository;

    public EmergencyVisitsPerHospitalService(EmergencyVisitsPerHospitalRepository emergencyVisitsPerHospitalRepository) {
        this.emergencyVisitsPerHospitalRepository = emergencyVisitsPerHospitalRepository;
    }

    public Page<EmergencyVisitsPerHospital> getAllEmergencyVisitesPerHospital(int page, int size){
        return this.emergencyVisitsPerHospitalRepository.findAll(PageRequest.of(page,size, Sort.by(Sort.Direction.DESC, "nombreVisites")));
    }
}
