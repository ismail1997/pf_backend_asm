package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.HospitalDim;
import org.ensim.pfa.pfa_backend.repositories.HospitalDimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HospitalDimService {
    private final HospitalDimRepository hospitalDimRepository;

    public HospitalDimService(HospitalDimRepository hospitalDimRepository) {
        this.hospitalDimRepository = hospitalDimRepository;
    }

    public Page<HospitalDim> getAll(int page, int size){
        return hospitalDimRepository.findAll(PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "roomCount")));
    }
}
