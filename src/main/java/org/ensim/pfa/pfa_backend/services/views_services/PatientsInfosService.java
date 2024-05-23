package org.ensim.pfa.pfa_backend.services.views_services;

import org.ensim.pfa.pfa_backend.model.views.PatientsInfos;
import org.ensim.pfa.pfa_backend.repositories.views_repositories.PatientsInfosRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PatientsInfosService {
    private final PatientsInfosRepository patientsInfosRepository;

    public PatientsInfosService(PatientsInfosRepository patientsInfosRepository) {
        this.patientsInfosRepository = patientsInfosRepository;
    }

    public Page<PatientsInfos> getAllPatientsInfos(int page, int size) {
        return this.patientsInfosRepository.findAll(PageRequest.of(page, size));
    }
}
