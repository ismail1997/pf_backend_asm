package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.MentalHealthStg;
import org.ensim.pfa.pfa_backend.repositories.MentalHealthStgRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MentalHealthStgService {
    private final MentalHealthStgRepository mentalHealthStgRepository;

    public MentalHealthStgService(MentalHealthStgRepository mentalHealthStgRepository) {
        this.mentalHealthStgRepository = mentalHealthStgRepository;
    }

    public Page<MentalHealthStg> getAll(int page, int size){
        return mentalHealthStgRepository.findAll(PageRequest.of(page, size));
    }
}
