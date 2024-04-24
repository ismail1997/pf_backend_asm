package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.HeartStg;
import org.ensim.pfa.pfa_backend.repositories.HeartStgRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HeartStgService {
    private final HeartStgRepository heartStgRepository;

    public HeartStgService(HeartStgRepository heartStgRepository) {
        this.heartStgRepository = heartStgRepository;
    }

    public Page<HeartStg> getAll(int page, int size) {
        return heartStgRepository.findAll(PageRequest.of(page, size));
    }
}
