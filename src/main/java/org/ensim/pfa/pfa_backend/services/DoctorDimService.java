package org.ensim.pfa.pfa_backend.services;

import org.ensim.pfa.pfa_backend.model.CardioTrain;
import org.ensim.pfa.pfa_backend.model.DoctorDim;
import org.ensim.pfa.pfa_backend.repositories.CardioTrainRepository;
import org.ensim.pfa.pfa_backend.repositories.DoctorDimRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DoctorDimService {
    private DoctorDimRepository doctorDimRepository;

    public DoctorDimService(DoctorDimRepository doctorDimRepository) {
        this.doctorDimRepository = doctorDimRepository;
    }


    public Page<DoctorDim> getAllDoctorDims(int page , int size){
        return this.doctorDimRepository.findAll(PageRequest.of(page,size));
    }
}
