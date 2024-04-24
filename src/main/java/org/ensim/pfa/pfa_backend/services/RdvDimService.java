package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.RdvDim;
import org.ensim.pfa.pfa_backend.repositories.RdvDimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RdvDimService {
    private final RdvDimRepository rdvDimRepository;

    public RdvDimService(RdvDimRepository rdvDimRepository) {
        this.rdvDimRepository = rdvDimRepository;
    }

    public Page<RdvDim> getAll(int page, int size){
        return rdvDimRepository.findAll(PageRequest.of(page, size));
    }
}
