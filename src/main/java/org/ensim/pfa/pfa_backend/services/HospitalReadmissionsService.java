package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.HospitalReadmissions;
import org.ensim.pfa.pfa_backend.repositories.HospitalReadmissionsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HospitalReadmissionsService {
    private final HospitalReadmissionsRepository hospitalReadmissionsRepository;

    public HospitalReadmissionsService(HospitalReadmissionsRepository hospitalReadmissionsRepository) {
        this.hospitalReadmissionsRepository = hospitalReadmissionsRepository;
    }

    public Page<HospitalReadmissions> getAll(int page, int size) {
        return hospitalReadmissionsRepository.findAll(PageRequest.of(page, size));
    }
}
