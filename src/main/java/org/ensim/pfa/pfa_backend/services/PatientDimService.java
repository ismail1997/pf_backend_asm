package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.PatientDim;
import org.ensim.pfa.pfa_backend.repositories.PatientDimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientDimService {
    private final PatientDimRepository patientDimRepository;

    public PatientDimService(PatientDimRepository patientDimRepository) {
        this.patientDimRepository = patientDimRepository;
    }

    public Page<PatientDim> getAll(int page, int size){
        return patientDimRepository.findAll(PageRequest.of(page, size));
    }
}
