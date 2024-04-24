package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.Heart;
import org.ensim.pfa.pfa_backend.repositories.HeartRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HeartService {
    private final HeartRepository heartRepository;

    public HeartService(HeartRepository heartRepository) {
        this.heartRepository = heartRepository;
    }

    public Page<Heart> getAll(int page, int size) {
        return heartRepository.findAll(PageRequest.of(page, size));
    }
}
