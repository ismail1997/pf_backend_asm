package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.ReadmissionHospitalStg;
import org.ensim.pfa.pfa_backend.repositories.ReadmissionHospitalStgRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReadmissionHospitalStgService {
    private final ReadmissionHospitalStgRepository readmissionHospitalStgRepository;

    public ReadmissionHospitalStgService(ReadmissionHospitalStgRepository readmissionHospitalStgRepository) {
        this.readmissionHospitalStgRepository = readmissionHospitalStgRepository;
    }

    public Page<ReadmissionHospitalStg> getAll(int page, int size){
        return readmissionHospitalStgRepository.findAll(PageRequest.of(page, size));
    }
}
